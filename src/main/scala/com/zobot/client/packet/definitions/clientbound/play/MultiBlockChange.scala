package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class MultiBlockChange(chunkX: Any, chunkZ: Any, recordCount: Any, recordHorizontalPosition: Any, recordYCoordinate: Any, recordBlockId: Any) extends Packet {
  override lazy val packetId = 0x10

  override lazy val packetData: Array[Byte] =
    fromAny(chunkX) ++
    fromAny(chunkZ) ++
    fromAny(recordCount) ++
    fromAny(recordHorizontalPosition) ++
    fromAny(recordYCoordinate) ++
    fromAny(recordBlockId)
}
