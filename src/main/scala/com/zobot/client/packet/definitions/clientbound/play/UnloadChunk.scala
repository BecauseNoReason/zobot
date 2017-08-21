package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UnloadChunk(chunkX: UnknownType, chunkZ: UnknownType) extends Packet {
  override lazy val packetId = 0x1D

  override lazy val packetData: Array[Byte] =
    fromUnknownType(chunkX) ++
    fromUnknownType(chunkZ)
}
