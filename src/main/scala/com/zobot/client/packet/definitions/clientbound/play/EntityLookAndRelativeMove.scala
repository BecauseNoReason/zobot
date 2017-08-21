package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityLookAndRelativeMove(entityId: Int, deltaX: UnknownType, deltaY: UnknownType, deltaZ: UnknownType, yaw: UnknownType, pitch: UnknownType, onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x27

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(deltaX) ++
    fromUnknownType(deltaY) ++
    fromUnknownType(deltaZ) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(onGround)
}
