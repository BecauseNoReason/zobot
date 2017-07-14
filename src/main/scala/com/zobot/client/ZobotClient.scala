package com.zobot.client

import akka.actor.{Actor, ActorRef}
import java.net.InetSocketAddress

class ZobotClient(host: String, port: Int) {

  lazy val socketAddress = new InetSocketAddress(host, port)

}

private class PacketClient(remote: InetSocketAddress, listener: ActorRef) extends Actor {

  override def receive: Receive = {

  }

}
