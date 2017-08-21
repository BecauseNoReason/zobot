package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class AttachEntity(attachedEntityId: Any, holdingEntityId: Any) extends Packet {
  override lazy val packetId = 0x3C

  override lazy val packetData: Array[Byte] =
    fromAny(attachedEntityId) ++
    fromAny(holdingEntityId)
}
