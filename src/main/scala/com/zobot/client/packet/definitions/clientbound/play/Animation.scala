package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Animation(entityId: Int, animation: UnknownType) extends Packet {
  override lazy val packetId = 0x06

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(animation)
}
