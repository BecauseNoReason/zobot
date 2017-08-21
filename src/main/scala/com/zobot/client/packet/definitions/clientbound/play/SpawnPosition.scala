package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnPosition(location: UnknownType) extends Packet {
  override lazy val packetId = 0x45

  override lazy val packetData: Array[Byte] =
    fromUnknownType(location)
}
