package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class CombatEvent(event: UnknownType, enterCombatNoFields: UnknownType, endCombatDuration: UnknownType, endCombatEntityId: UnknownType, entityDeadPlayerId: UnknownType, entityDeadId: UnknownType, entityDeadMessage: UnknownType) extends Packet {
  override lazy val packetId = 0x2C

  override lazy val packetData: Array[Byte] =
    fromUnknownType(event) ++
    fromUnknownType(enterCombatNoFields) ++
    fromUnknownType(endCombatDuration) ++
    fromUnknownType(endCombatEntityId) ++
    fromUnknownType(entityDeadPlayerId) ++
    fromUnknownType(entityDeadId) ++
    fromUnknownType(entityDeadMessage)
}
