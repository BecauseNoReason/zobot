package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UpdateScore(entityName: UnknownType, action: UnknownType, objectiveName: String, value: UnknownType) extends Packet {
  override lazy val packetId = 0x44

  override lazy val packetData: Array[Byte] =
    fromUnknownType(entityName) ++
    fromUnknownType(action) ++
    fromVarString(objectiveName) ++
    fromUnknownType(value)
}
