package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class Player(onGround: Any) extends Packet {
  override lazy val packetId = 0x0C

  override lazy val packetData: Array[Byte] =
    fromAny(onGround)
}
