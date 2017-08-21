package com.zobot.client.packet.definitions.serverbound.status

import com.zobot.client.packet.Packet

case class Ping(payload: Any) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromAny(payload)
}
