package com.zobot.client


import akka.actor.{Actor, ActorRef, Props}
import akka.io.IO
import akka.io.Tcp
import akka.io.Tcp.{CommandFailed, Connect, Connected, Register}
import java.net.InetSocketAddress

import scala.concurrent.Future

class ZobotClient(host: String, port: Int) {

  lazy val socketAddress = new InetSocketAddress(host, port)
  lazy val packetClient = new PacketClient(socketAddress)

  def login(username: String, password: String): Future[ZobotClient] = {
    println(username, password)

    Future.successful(this)
  }

  def foo(): Unit = {
    println("bar")
  }


}

class PacketHandler extends Actor {

  override def receive: Receive = {
    case data => {
      println(data)
    }
  }

}

class PacketClient(remote: InetSocketAddress) extends Actor {

  import context.system

  IO(Tcp) ! Connect(remote)

  lazy val listener: ActorRef = context.actorOf(Props[PacketHandler])

  override def receive: Receive = {
    case CommandFailed(_: Connect) => {
      listener ! "Failed to connect"
      context stop self
    }

    case connected@Connected(remote, local) => {
      listener ! connected
      val connection = sender()
      connection ! Register(self)

      context become {
        case data: Any => {
          listener ! data
        }
      }
    }
  }

}