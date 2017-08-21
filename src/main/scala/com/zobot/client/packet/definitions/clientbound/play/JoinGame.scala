package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class JoinGame(entityId: UnknownType, gamemode: UnknownType, dimension: UnknownType, difficulty: UnknownType, maxPlayers: UnknownType, levelType: UnknownType, reducedDebugInfo: UnknownType) extends Packet {
  override lazy val packetId = 0x23

  override lazy val packetData: Array[Byte] =
    fromUnknownType(entityId) ++
    fromUnknownType(gamemode) ++
    fromUnknownType(dimension) ++
    fromUnknownType(difficulty) ++
    fromUnknownType(maxPlayers) ++
    fromUnknownType(levelType) ++
    fromUnknownType(reducedDebugInfo)
}
