package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Advancements(resetClear: UnknownType, mappingSize: UnknownType, advancementMappingKey: UnknownType, advancementMappingValue: UnknownType, listSize: UnknownType, identifiers: UnknownType, progressSize: UnknownType, progressMappingKey: UnknownType, progressMappingValue: UnknownType) extends Packet {
  override lazy val packetId = 0x4C

  override lazy val packetData: Array[Byte] =
    fromUnknownType(resetClear) ++
    fromUnknownType(mappingSize) ++
    fromUnknownType(advancementMappingKey) ++
    fromUnknownType(advancementMappingValue) ++
    fromUnknownType(listSize) ++
    fromUnknownType(identifiers) ++
    fromUnknownType(progressSize) ++
    fromUnknownType(progressMappingKey) ++
    fromUnknownType(progressMappingValue)
}
