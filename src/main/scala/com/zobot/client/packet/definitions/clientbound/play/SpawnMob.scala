package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnMob(entityId: Int, entityUuid: UnknownType, propertyType: Int, x: UnknownType, y: UnknownType, z: UnknownType, yaw: UnknownType, pitch: UnknownType, headPitch: UnknownType, velocityX: UnknownType, velocityY: UnknownType, velocityZ: UnknownType, metadata: UnknownType) extends Packet {
  override lazy val packetId = 0x03

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(entityUuid) ++
    fromVarInt(propertyType) ++
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(headPitch) ++
    fromUnknownType(velocityX) ++
    fromUnknownType(velocityY) ++
    fromUnknownType(velocityZ) ++
    fromUnknownType(metadata)
}
