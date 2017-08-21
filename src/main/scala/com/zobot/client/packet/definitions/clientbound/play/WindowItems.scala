package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class WindowItems(windowId: UnknownType, count: UnknownType, slotData: UnknownType) extends Packet {
  override lazy val packetId = 0x14

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(count) ++
    fromUnknownType(slotData)
}
