package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnObject(entityId: Int, objectUuid: Any, propertyType: Any, x: Any, y: Any, z: Any, pitch: Any, yaw: Any, data: Any, velocityX: Any, short: Any) extends Packet {
  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(objectUuid) ++
    fromAny(propertyType) ++
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(pitch) ++
    fromAny(yaw) ++
    fromAny(data) ++
    fromAny(velocityX) ++
    fromAny(short)
}
