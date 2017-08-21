package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class OpenWindow(windowId: Any, windowType: Any, windowTitle: Any, numberOfSlots: Any, entityId: Any) extends Packet {
  override lazy val packetId = 0x13

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(windowType) ++
    fromAny(windowTitle) ++
    fromAny(numberOfSlots) ++
    fromAny(entityId)
}
