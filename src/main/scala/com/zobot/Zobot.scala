package com.zobot

import com.zobot.client.ZobotClient

object Zobot extends App {

  lazy val zobotClient = new ZobotClient("127.0.0.1", 12345)

}
