package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UseBed(entityId: Int, location: UnknownType) extends Packet {
  override lazy val packetId = 0x2F

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(location)
}
