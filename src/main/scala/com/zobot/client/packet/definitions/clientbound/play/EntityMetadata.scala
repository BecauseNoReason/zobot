package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityMetadata(entityId: Int, metadata: UnknownType) extends Packet {
  override lazy val packetId = 0x3B

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(metadata)
}
