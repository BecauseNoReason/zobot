package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class WindowProperty(windowId: Any, property: Any, value: Any) extends Packet {
  override lazy val packetId = 0x15

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(property) ++
    fromAny(value)
}
