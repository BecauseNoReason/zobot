package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class OpenWindow(windowId: UnknownType, windowType: UnknownType, windowTitle: UnknownType, numberOfSlots: UnknownType, entityId: UnknownType) extends Packet {
  override lazy val packetId = 0x13

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(windowType) ++
    fromUnknownType(windowTitle) ++
    fromUnknownType(numberOfSlots) ++
    fromUnknownType(entityId)
}
