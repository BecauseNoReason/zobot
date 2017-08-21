package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class WindowItems(windowId: Any, count: Any, slotData: Any) extends Packet {
  override lazy val packetId = 0x14

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(count) ++
    fromAny(slotData)
}
