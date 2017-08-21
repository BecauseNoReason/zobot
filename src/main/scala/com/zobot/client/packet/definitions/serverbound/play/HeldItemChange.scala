package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class HeldItemChange(slot: UnknownType) extends Packet {
  override lazy val packetId = 0x1A

  override lazy val packetData: Array[Byte] =
    fromUnknownType(slot)
}
