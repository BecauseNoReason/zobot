package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityTeleport(entityId: Int, x: UnknownType, y: UnknownType, z: UnknownType, yaw: UnknownType, pitch: UnknownType, onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x4B

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(onGround)
}
