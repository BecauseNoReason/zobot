package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class CraftingBookData(propertyType: Any, displayedRecipeId: Any, craftingBookStatusOpen: Any, craftingBookStatusFilter: Any) extends Packet {
  override lazy val packetId = 0x17

  override lazy val packetData: Array[Byte] =
    fromAny(propertyType) ++
    fromAny(displayedRecipeId) ++
    fromAny(craftingBookStatusOpen) ++
    fromAny(craftingBookStatusFilter)
}
