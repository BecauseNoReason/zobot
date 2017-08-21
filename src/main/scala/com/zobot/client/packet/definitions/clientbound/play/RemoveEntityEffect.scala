package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class RemoveEntityEffect(entityId: Int, effectId: Any) extends Packet {
  override lazy val packetId = 0x32

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(effectId)
}
