package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityVelocity(entityId: Int, velocityX: Any, velocityY: Any, velocityZ: Any) extends Packet {
  override lazy val packetId = 0x3E

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(velocityX) ++
    fromAny(velocityY) ++
    fromAny(velocityZ)
}
