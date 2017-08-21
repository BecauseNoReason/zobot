package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityHeadLook(entityId: Int, headYaw: UnknownType) extends Packet {
  override lazy val packetId = 0x35

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(headYaw)
}
