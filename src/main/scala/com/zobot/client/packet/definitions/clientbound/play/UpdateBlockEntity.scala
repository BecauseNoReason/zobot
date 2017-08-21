package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UpdateBlockEntity(location: UnknownType, action: UnknownType, nbtData: UnknownType) extends Packet {
  override lazy val packetId = 0x09

  override lazy val packetData: Array[Byte] =
    fromUnknownType(location) ++
    fromUnknownType(action) ++
    fromUnknownType(nbtData)
}
