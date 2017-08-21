package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ServerDifficulty(difficulty: Any) extends Packet {
  override lazy val packetId = 0x0D

  override lazy val packetData: Array[Byte] =
    fromAny(difficulty)
}
