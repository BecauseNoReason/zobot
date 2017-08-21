package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ChunkData(chunkX: Any, chunkZ: Any, groundUpContinuous: Any, primaryBitMask: Int, size: Int, data: Any, numberOfBlockEntities: Int, blockEntities: Any) extends Packet {
  override lazy val packetId = 0x20

  override lazy val packetData: Array[Byte] =
    fromAny(chunkX) ++
    fromAny(chunkZ) ++
    fromAny(groundUpContinuous) ++
    fromVarInt(primaryBitMask) ++
    fromVarInt(size) ++
    fromAny(data) ++
    fromVarInt(numberOfBlockEntities) ++
    fromAny(blockEntities)
}
