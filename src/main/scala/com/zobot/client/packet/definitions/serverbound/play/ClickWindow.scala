package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ClickWindow(windowId: Any, slot: Any, button: Any, actionNumber: Any, mode: Int, clickedItem: Any) extends Packet {
  override lazy val packetId = 0x08

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(slot) ++
    fromAny(button) ++
    fromAny(actionNumber) ++
    fromVarInt(mode) ++
    fromAny(clickedItem)
}
