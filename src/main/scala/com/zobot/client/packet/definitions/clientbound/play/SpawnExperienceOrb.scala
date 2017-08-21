package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnExperienceOrb(entityId: Int, x: Any, y: Any, z: Any, count: Any) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(count)
}
