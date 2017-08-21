package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityRelativeMove(entityId: Int, deltaX: Any, deltaY: Any, deltaZ: Any, onGround: Any) extends Packet {
  override lazy val packetId = 0x26

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(deltaX) ++
    fromAny(deltaY) ++
    fromAny(deltaZ) ++
    fromAny(onGround)
}
