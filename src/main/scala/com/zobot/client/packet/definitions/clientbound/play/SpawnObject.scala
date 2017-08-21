package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnObject(entityId: Int, objectUuid: UnknownType, propertyType: UnknownType, x: UnknownType, y: UnknownType, z: UnknownType, pitch: UnknownType, yaw: UnknownType, data: UnknownType, velocityX: UnknownType, short: UnknownType) extends Packet {
  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(objectUuid) ++
    fromUnknownType(propertyType) ++
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(pitch) ++
    fromUnknownType(yaw) ++
    fromUnknownType(data) ++
    fromUnknownType(velocityX) ++
    fromUnknownType(short)
}
