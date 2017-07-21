package com.zobot.client

import java.net.InetSocketAddress

import akka.actor.{Actor, ActorRef, ActorSystem, Props, Stash}
import akka.io.Tcp._
import akka.io.{IO, Tcp}
import akka.pattern.ask
import akka.util.{ByteString, Timeout}
import com.zobot.client.packet.models.Handshake
import com.zobot.client.packet.PacketSerializer

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.collection.mutable.ArrayBuffer

/**
  * A class with basic interaction methods to be used against the targeted Minecraft server.
  *
  * @param host The host address or the server
  * @param port The port number of the server
  */
class ZobotClient(host: String, port: Int) {

  lazy val socketAddress = new InetSocketAddress(host, port)

  implicit val system = ActorSystem("zobot")
  implicit val timeout = Timeout(5 seconds)

  val handler: ActorRef = system actorOf PacketHandler.props()
  val client: ActorRef = system actorOf PacketClient.props(socketAddress, handler)

  def login(username: String, password: String): Future[Any] = {
    println(username, password)

    val handshake = Handshake(2)
    val serializer = new PacketSerializer()
    val output = serializer.toBinary(handshake)

    println("SCALA:", insertPeriodically(bytesToHex(output), " ", 2))
    println("SCALA:", insertPeriodically(bytesToHex(BigInt(0x00).toByteArray ++ Varint(316) ++ String255(host) ++ UnsignedShort(port) ++ Varint(2)), " ", 2))
    println("JSCRT:", "00 bc 02 0e 31 39 32 2e 31 36 38 2e 39 39 2e 31 30 30 80 00 02")

    client ? ByteString(output)
  }

  private val hexArray = "0123456789ABCDEF".toCharArray

  def String255(x: String): Array[Byte] = BigInt(x.length).toByteArray ++ x.getBytes

  var INT: Double = Math.pow(2, 31)
  var MSB: Int = 0x80
  var REST: Int = 0x7F
  var MSBALL: Int = ~REST

  def Varint(x: Int): Array[Byte] = {
    var number = x + 1
    var output = ArrayBuffer[Int]()

    while (number >= INT) {
      output += (number + 0xFF) | MSB
      number /= 128
    }

    while (number + MSBALL > 0) {
      output += (number + 0xFF) | MSB
      number >>>= 7
    }

    output += number | 0

    output.map(_.toByte).toArray
  }

  def UnsignedShort(x: Int): Array[Byte] = BigInt(x.toShort).toByteArray

  def bytesToHex(bytes: Array[Byte]): String = {
    val hexChars = new Array[Char](bytes.length * 2)
    var j = 0
    while ( {
      j < bytes.length
    }) {
      val v = bytes(j) & 0xFF
      hexChars(j * 2) = hexArray(v >>> 4)
      hexChars(j * 2 + 1) = hexArray(v & 0x0F)

      {
        j += 1
        j - 1
      }
    }
    new String(hexChars)
  }

  def insertPeriodically(text: String, insert: String, period: Int): String = {
    val builder = new StringBuilder(text.length + insert.length * (text.length / period) + 1)
    var index = 0
    var prefix = ""
    while ( {
      index < text.length
    }) { // Don't put the insert in the very first iteration.
      // This is easier than appending it *after* each substring
      builder.append(prefix)
      prefix = insert
      builder.append(text.substring(index, Math.min(index + period, text.length)))
      index += period
    }
    builder.toString
  }

  class PacketClient(remote: InetSocketAddress, handler: ActorRef) extends Actor with Stash {

    override def preStart() {
      IO(Tcp) ! Connect(remote)
    }

    override def receive: Receive = {

      case CommandFailed(_) =>
        println("Connection failed")
        context stop self

      case Connected(_, _) =>
        val connection = sender
        connection ! Register(self)

        unstashAll
        context become readyForMessages(connection)

      case _ =>
        stash
    }

    def readyForMessages(connection: ActorRef): Receive = {
      case data: ByteString =>
        context become waitingForResponse(connection, sender)
        connection ! Write(data)

      case data: StringBuffer =>
        connection ! Write(ByteString(data.toString))

      case Received(data) =>
        handler ! data

      case _: ConnectionClosed =>
        context stop self
    }

    def waitingForResponse(connection: ActorRef, requester: ActorRef): Receive = {
      case Received(response) =>
        unstashAll
        context become readyForMessages(connection)
        requester ! response

      case _ =>
        stash
    }

  }

  case class HandlerResponse(msg: String)

  class PacketHandler extends Actor {

    override def receive: Receive = {
      case data: ByteString =>
        println("here", data decodeString ByteString.UTF_8)
        sender ! HandlerResponse("asdlaksjdl")
    }
  }

  object PacketClient {
    def props(remote: InetSocketAddress, replies: ActorRef): Props =
      Props(new PacketClient(remote, replies))
  }

  object PacketHandler {
    def props(): Props =
      Props(new PacketHandler())
  }

}