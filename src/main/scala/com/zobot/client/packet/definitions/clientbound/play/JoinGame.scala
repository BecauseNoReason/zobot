package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class JoinGame(entityId: Any, gamemode: Any, dimension: Any, difficulty: Any, maxPlayers: Any, levelType: Any, reducedDebugInfo: Any) extends Packet {
  override lazy val packetId = 0x23

  override lazy val packetData: Array[Byte] =
    fromAny(entityId) ++
    fromAny(gamemode) ++
    fromAny(dimension) ++
    fromAny(difficulty) ++
    fromAny(maxPlayers) ++
    fromAny(levelType) ++
    fromAny(reducedDebugInfo)
}
