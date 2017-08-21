package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityRelativeMove(entityId: Int, deltaX: UnknownType, deltaY: UnknownType, deltaZ: UnknownType, onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x26

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(deltaX) ++
    fromUnknownType(deltaY) ++
    fromUnknownType(deltaZ) ++
    fromUnknownType(onGround)
}
