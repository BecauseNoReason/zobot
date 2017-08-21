package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Respawn(dimension: UnknownType, difficulty: UnknownType, gamemode: UnknownType, levelType: String) extends Packet {
  override lazy val packetId = 0x34

  override lazy val packetData: Array[Byte] =
    fromUnknownType(dimension) ++
    fromUnknownType(difficulty) ++
    fromUnknownType(gamemode) ++
    fromVarString(levelType)
}
