package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class Player(onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x0D

  override lazy val packetData: Array[Byte] =
    fromUnknownType(onGround)
}
