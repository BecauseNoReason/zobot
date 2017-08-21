package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnGlobalEntity(entityId: Int, propertyType: UnknownType, x: UnknownType, y: UnknownType, z: UnknownType) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(propertyType) ++
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z)
}
