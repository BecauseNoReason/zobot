package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class CombatEvent(event: Any, enterCombatNoFields: Any, endCombatDuration: Any, endCombatEntityId: Any, entityDeadPlayerId: Any, entityDeadId: Any, entityDeadMessage: Any) extends Packet {
  override lazy val packetId = 0x2D

  override lazy val packetData: Array[Byte] =
    fromAny(event) ++
    fromAny(enterCombatNoFields) ++
    fromAny(endCombatDuration) ++
    fromAny(endCombatEntityId) ++
    fromAny(entityDeadPlayerId) ++
    fromAny(entityDeadId) ++
    fromAny(entityDeadMessage)
}
