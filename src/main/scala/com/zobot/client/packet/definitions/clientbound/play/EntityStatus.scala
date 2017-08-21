package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityStatus(entityId: UnknownType, entityStatus: UnknownType) extends Packet {
  override lazy val packetId = 0x1B

  override lazy val packetData: Array[Byte] =
    fromUnknownType(entityId) ++
    fromUnknownType(entityStatus)
}
