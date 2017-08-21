package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class Spectate(targetPlayer: UnknownType) extends Packet {
  override lazy val packetId = 0x1E

  override lazy val packetData: Array[Byte] =
    fromUnknownType(targetPlayer)
}
