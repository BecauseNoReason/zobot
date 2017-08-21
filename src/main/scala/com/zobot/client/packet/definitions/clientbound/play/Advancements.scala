package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Advancements(resetClear: Any, mappingSize: Any, advancementMappingKey: Any, advancementMappingValue: Any, listSize: Any, identifiers: Any, progressSize: Any, progressMappingKey: Any, progressMappingValue: Any) extends Packet {
  override lazy val packetId = 0x4C

  override lazy val packetData: Array[Byte] =
    fromAny(resetClear) ++
    fromAny(mappingSize) ++
    fromAny(advancementMappingKey) ++
    fromAny(advancementMappingValue) ++
    fromAny(listSize) ++
    fromAny(identifiers) ++
    fromAny(progressSize) ++
    fromAny(progressMappingKey) ++
    fromAny(progressMappingValue)
}
