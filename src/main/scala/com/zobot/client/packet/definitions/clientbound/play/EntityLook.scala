package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityLook(entityId: Int, yaw: Any, pitch: Any, onGround: Any) extends Packet {
  override lazy val packetId = 0x28

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(onGround)
}
