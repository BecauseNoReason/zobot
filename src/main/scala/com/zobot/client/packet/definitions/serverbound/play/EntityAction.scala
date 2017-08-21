package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class EntityAction(entityId: Int, actionId: Int, jumpBoost: Int) extends Packet {
  override lazy val packetId = 0x15

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromVarInt(actionId) ++
    fromVarInt(jumpBoost)
}
