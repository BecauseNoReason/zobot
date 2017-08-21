package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnGlobalEntity(entityId: Int, propertyType: Any, x: Any, y: Any, z: Any) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(propertyType) ++
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z)
}
