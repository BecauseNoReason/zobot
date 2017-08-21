package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnExperienceOrb(entityId: Int, x: UnknownType, y: UnknownType, z: UnknownType, count: UnknownType) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(count)
}
