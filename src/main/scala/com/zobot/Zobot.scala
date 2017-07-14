package com.zobot

import com.zobot.client.ZobotClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Zobot extends App {

  val client = new ZobotClient("127.0.0.1", 12345)

  client.login("user", "pass").andThen {
    case Success(client) => client.foo()
    case Failure(e) => println(e)
  }

}
