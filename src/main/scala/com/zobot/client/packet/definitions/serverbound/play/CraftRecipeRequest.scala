package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class CraftRecipeRequest(windowId: Any, recipe: Int, makeAll: Any) extends Packet {
  override lazy val packetId = 0x12

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromVarInt(recipe) ++
    fromAny(makeAll)
}
