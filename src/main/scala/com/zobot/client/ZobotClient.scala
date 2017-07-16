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

    val handshake = Handshake(host, port)
    val serializer = new PacketSerializer()
    val output = serializer.toBinary(handshake)

    println("PRE:", output)

    client ! output
    client ! 0x01
    client ? 0x00
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