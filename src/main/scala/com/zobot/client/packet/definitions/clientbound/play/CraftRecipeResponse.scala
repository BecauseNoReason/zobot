package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class CraftRecipeResponse(windowId: Any, recipe: Int) extends Packet {
  override lazy val packetId = 0x2B

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromVarInt(recipe)
}
