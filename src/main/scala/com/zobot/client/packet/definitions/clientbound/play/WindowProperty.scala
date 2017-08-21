package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class WindowProperty(windowId: UnknownType, property: UnknownType, value: UnknownType) extends Packet {
  override lazy val packetId = 0x15

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(property) ++
    fromUnknownType(value)
}
