package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UpdateScore(entityName: Any, action: Any, objectiveName: String, value: Any) extends Packet {
  override lazy val packetId = 0x45

  override lazy val packetData: Array[Byte] =
    fromAny(entityName) ++
    fromAny(action) ++
    fromVarString(objectiveName) ++
    fromAny(value)
}
