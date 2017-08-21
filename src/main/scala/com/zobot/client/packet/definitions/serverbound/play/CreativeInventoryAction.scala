package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class CreativeInventoryAction(slot: UnknownType, clickedItem: UnknownType) extends Packet {
  override lazy val packetId = 0x1B

  override lazy val packetData: Array[Byte] =
    fromUnknownType(slot) ++
    fromUnknownType(clickedItem)
}
