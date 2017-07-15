package com.zobot.client

import java.net.InetSocketAddress

import akka.actor.{Actor, ActorRef, ActorSystem, Props, Stash}
import akka.io.Tcp._
import akka.io.{IO, Tcp}
import akka.pattern.ask
import akka.util.{ByteString, Timeout}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Failure

/**
  * A class with basic interaction methods to be used against the targeted Minecraft server.
  *
  * @param host The host address or the server
  * @param port The port number of the server
  */
class ZobotClient(host: String, port: Int) {

  lazy val socketAddress = new InetSocketAddress(host, port)

  implicit val system = ActorSystem()
  implicit val timeout = Timeout(5 seconds)

  val handler: ActorRef = system actorOf PacketHandler.props()
  val client: ActorRef = system actorOf PacketClient.props(socketAddress, handler)

  def login(username: String, password: String): Future[Unit] = {
    println(username, password)

    Future {
      client ? ByteString("hello") andThen {
        case Failure(e) => println(e)
      }
    }
  }

  object PacketClient {
    def props(remote: InetSocketAddress, replies: ActorRef): Props =
      Props(new PacketClient(remote, replies))
  }

  class PacketClient(remote: InetSocketAddress, listener: ActorRef) extends Actor with Stash {

    override def preStart() {
      IO(Tcp) ! Connect(remote)
    }

    override def receive: Receive = {
      case CommandFailed(_) =>
        context stop self
      case Connected(_, _) =>
        val connection = sender()
        connection ! Register(self)

        unstashAll
        context become {
          case data: ByteString =>
            connection ! Write(data)
          case Received(data) =>
            listener ! data
          case _: ConnectionClosed =>
            context stop self
        }
      case _: ByteString =>
        stash
    }

  }

  object PacketHandler {
    def props(): Props =
      Props(new PacketHandler())
  }

  class PacketHandler extends Actor {

    override def receive: Receive = {
      case data: ByteString =>
        println(data decodeString ByteString.UTF_8)
    }

  }

}