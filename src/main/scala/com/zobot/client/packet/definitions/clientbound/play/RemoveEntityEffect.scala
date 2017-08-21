package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class RemoveEntityEffect(entityId: Int, effectId: UnknownType) extends Packet {
  override lazy val packetId = 0x32

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(effectId)
}
