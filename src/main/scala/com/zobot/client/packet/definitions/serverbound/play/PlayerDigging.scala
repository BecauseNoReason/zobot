package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerDigging(status: Int, location: UnknownType, face: UnknownType) extends Packet {
  override lazy val packetId = 0x14

  override lazy val packetData: Array[Byte] =
    fromVarInt(status) ++
    fromUnknownType(location) ++
    fromUnknownType(face)
}
