package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ChunkData(chunkX: UnknownType, chunkZ: UnknownType, groundUpContinuous: UnknownType, primaryBitMask: Int, size: Int, data: UnknownType, numberOfBlockEntities: Int, blockEntities: UnknownType) extends Packet {
  override lazy val packetId = 0x20

  override lazy val packetData: Array[Byte] =
    fromUnknownType(chunkX) ++
    fromUnknownType(chunkZ) ++
    fromUnknownType(groundUpContinuous) ++
    fromVarInt(primaryBitMask) ++
    fromVarInt(size) ++
    fromUnknownType(data) ++
    fromVarInt(numberOfBlockEntities) ++
    fromUnknownType(blockEntities)
}
