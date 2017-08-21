package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class CraftingBookData(propertyType: UnknownType, displayedRecipeId: UnknownType, craftingBookStatusOpen: UnknownType, craftingBookStatusFilter: UnknownType) extends Packet {
  override lazy val packetId = 0x17

  override lazy val packetData: Array[Byte] =
    fromUnknownType(propertyType) ++
    fromUnknownType(displayedRecipeId) ++
    fromUnknownType(craftingBookStatusOpen) ++
    fromUnknownType(craftingBookStatusFilter)
}
