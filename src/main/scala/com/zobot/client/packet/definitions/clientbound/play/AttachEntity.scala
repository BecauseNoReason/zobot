package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class AttachEntity(attachedEntityId: UnknownType, holdingEntityId: UnknownType) extends Packet {
  override lazy val packetId = 0x3C

  override lazy val packetData: Array[Byte] =
    fromUnknownType(attachedEntityId) ++
    fromUnknownType(holdingEntityId)
}
