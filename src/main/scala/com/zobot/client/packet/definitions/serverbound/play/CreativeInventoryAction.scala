package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class CreativeInventoryAction(slot: Any, clickedItem: Any) extends Packet {
  override lazy val packetId = 0x1B

  override lazy val packetData: Array[Byte] =
    fromAny(slot) ++
    fromAny(clickedItem)
}
