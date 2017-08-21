package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class HeldItemChange(slot: Any) extends Packet {
  override lazy val packetId = 0x39

  override lazy val packetData: Array[Byte] =
    fromAny(slot)
}
