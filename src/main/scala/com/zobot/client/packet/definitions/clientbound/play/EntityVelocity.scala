package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityVelocity(entityId: Int, velocityX: UnknownType, velocityY: UnknownType, velocityZ: UnknownType) extends Packet {
  override lazy val packetId = 0x3D

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(velocityX) ++
    fromUnknownType(velocityY) ++
    fromUnknownType(velocityZ)
}
