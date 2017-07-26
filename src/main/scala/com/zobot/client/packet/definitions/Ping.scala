package com.zobot.client.packet.definitions

import com.zobot.client.packet.Packet

/**
  *
  */
case class Ping() extends Packet {

  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    BigInt(100).toByteArray

}
