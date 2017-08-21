package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SetSlot(windowId: UnknownType, slot: UnknownType, slotData: UnknownType) extends Packet {
  override lazy val packetId = 0x16

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(slot) ++
    fromUnknownType(slotData)
}
