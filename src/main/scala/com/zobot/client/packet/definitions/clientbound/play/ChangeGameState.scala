package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ChangeGameState(reason: UnknownType, value: UnknownType) extends Packet {
  override lazy val packetId = 0x1E

  override lazy val packetData: Array[Byte] =
    fromUnknownType(reason) ++
    fromUnknownType(value)
}
