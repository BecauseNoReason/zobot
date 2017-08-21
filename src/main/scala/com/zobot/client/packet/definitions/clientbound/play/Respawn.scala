package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Respawn(dimension: Any, difficulty: Any, gamemode: Any, levelType: String) extends Packet {
  override lazy val packetId = 0x34

  override lazy val packetData: Array[Byte] =
    fromAny(dimension) ++
    fromAny(difficulty) ++
    fromAny(gamemode) ++
    fromVarString(levelType)
}
