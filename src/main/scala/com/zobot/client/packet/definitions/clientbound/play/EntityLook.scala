package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityLook(entityId: Int, yaw: UnknownType, pitch: UnknownType, onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x28

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(onGround)
}
