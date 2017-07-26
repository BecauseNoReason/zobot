package com.zobot.client.packet.definitions

import com.zobot.client.packet.Packet

/**
  *
  */
case class Request() extends Packet {

  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    Array()

}
