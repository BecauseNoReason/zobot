package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UpdateBlockEntity(location: Any, action: Any, nbtData: Any) extends Packet {
  override lazy val packetId = 0x09

  override lazy val packetData: Array[Byte] =
    fromAny(location) ++
    fromAny(action) ++
    fromAny(nbtData)
}
