package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UnlockRecipes(count: Int, entityIds: UnknownType) extends Packet {
  override lazy val packetId = 0x31

  override lazy val packetData: Array[Byte] =
    fromVarInt(count) ++
    fromUnknownType(entityIds)
}
