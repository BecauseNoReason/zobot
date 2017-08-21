package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ScoreboardObjective(objectiveName: String, mode: Any, objectiveValue: Any, propertyType: Any) extends Packet {
  override lazy val packetId = 0x42

  override lazy val packetData: Array[Byte] =
    fromVarString(objectiveName) ++
    fromAny(mode) ++
    fromAny(objectiveValue) ++
    fromAny(propertyType)
}
