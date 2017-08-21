package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UseBed(entityId: Int, location: Any) extends Packet {
  override lazy val packetId = 0x30

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(location)
}
