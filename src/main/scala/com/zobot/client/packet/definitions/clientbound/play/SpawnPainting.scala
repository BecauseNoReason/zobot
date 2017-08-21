package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnPainting(entityId: Int, entityUuid: UnknownType, title: UnknownType, location: UnknownType, direction: UnknownType) extends Packet {
  override lazy val packetId = 0x04

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(entityUuid) ++
    fromUnknownType(title) ++
    fromUnknownType(location) ++
    fromUnknownType(direction)
}
