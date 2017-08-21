package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ClickWindow(windowId: UnknownType, slot: UnknownType, button: UnknownType, actionNumber: UnknownType, mode: Int, clickedItem: UnknownType) extends Packet {
  override lazy val packetId = 0x08

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(slot) ++
    fromUnknownType(button) ++
    fromUnknownType(actionNumber) ++
    fromVarInt(mode) ++
    fromUnknownType(clickedItem)
}
