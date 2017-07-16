package com.zobot

import akka.util.ByteString
import com.zobot.client.ZobotClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Zobot extends App {

  val client = new ZobotClient("192.168.99.100", 32770)

  client login("user", "pass") andThen {
    case Success(a: ByteString) => println("completed once!", a decodeString ByteString.UTF_8)
    case Failure(e) => println("error", e)
  }

}
