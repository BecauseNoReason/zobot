package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnPainting(entityId: Int, entityUuid: Any, title: Any, location: Any, direction: Any) extends Packet {
  override lazy val packetId = 0x04

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(entityUuid) ++
    fromAny(title) ++
    fromAny(location) ++
    fromAny(direction)
}
