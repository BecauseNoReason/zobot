package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityLookAndRelativeMove(entityId: Int, deltaX: Any, deltaY: Any, deltaZ: Any, yaw: Any, pitch: Any, onGround: Any) extends Packet {
  override lazy val packetId = 0x27

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(deltaX) ++
    fromAny(deltaY) ++
    fromAny(deltaZ) ++
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(onGround)
}
