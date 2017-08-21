package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnMob(entityId: Int, entityUuid: Any, propertyType: Int, x: Any, y: Any, z: Any, yaw: Any, pitch: Any, headPitch: Any, velocityX: Any, velocityY: Any, velocityZ: Any, metadata: Any) extends Packet {
  override lazy val packetId = 0x03

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(entityUuid) ++
    fromVarInt(propertyType) ++
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(headPitch) ++
    fromAny(velocityX) ++
    fromAny(velocityY) ++
    fromAny(velocityZ) ++
    fromAny(metadata)
}
