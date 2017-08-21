package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class MultiBlockChange(chunkX: UnknownType, chunkZ: UnknownType, recordCount: UnknownType, recordHorizontalPosition: UnknownType, recordYCoordinate: UnknownType, recordBlockId: UnknownType) extends Packet {
  override lazy val packetId = 0x10

  override lazy val packetData: Array[Byte] =
    fromUnknownType(chunkX) ++
    fromUnknownType(chunkZ) ++
    fromUnknownType(recordCount) ++
    fromUnknownType(recordHorizontalPosition) ++
    fromUnknownType(recordYCoordinate) ++
    fromUnknownType(recordBlockId)
}
