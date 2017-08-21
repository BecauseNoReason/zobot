package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class BlockBreakAnimation(entityId: Int, location: Any, destroyStage: Any) extends Packet {
  override lazy val packetId = 0x08

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(location) ++
    fromAny(destroyStage)
}
