package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ServerDifficulty(difficulty: UnknownType) extends Packet {
  override lazy val packetId = 0x0D

  override lazy val packetData: Array[Byte] =
    fromUnknownType(difficulty)
}
