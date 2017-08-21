package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SetSlot(windowId: Any, slot: Any, slotData: Any) extends Packet {
  override lazy val packetId = 0x16

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(slot) ++
    fromAny(slotData)
}
