package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ScoreboardObjective(objectiveName: String, mode: UnknownType, objectiveValue: UnknownType, propertyType: UnknownType) extends Packet {
  override lazy val packetId = 0x41

  override lazy val packetData: Array[Byte] =
    fromVarString(objectiveName) ++
    fromUnknownType(mode) ++
    fromUnknownType(objectiveValue) ++
    fromUnknownType(propertyType)
}
