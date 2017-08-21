package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityTeleport(entityId: Int, x: Any, y: Any, z: Any, yaw: Any, pitch: Any, onGround: Any) extends Packet {
  override lazy val packetId = 0x4C

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(onGround)
}
