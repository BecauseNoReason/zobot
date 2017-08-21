package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PlayerListItem(action: UnknownType, numberOfPlayers: UnknownType, playerUuid: UnknownType, playerAddName: UnknownType, playerAddNumberOfProperties: UnknownType, playerAddPropertyName: UnknownType, playerAddPropertyValue: UnknownType, playerAddPropertyIsSigned: UnknownType, playerAddPropertySignature: UnknownType, playerAddGamemode: UnknownType, playerAddPing: UnknownType, playerAddHasDisplayName: UnknownType, playerAddDisplayName: UnknownType, playerUpdateGamemode: UnknownType, playerUpdateLatencyPing: UnknownType, playerUpdateDisplayNameHas: UnknownType, playerUpdateDisplayName: UnknownType, playerRemoveNoFields: UnknownType) extends Packet {
  override lazy val packetId = 0x2D

  override lazy val packetData: Array[Byte] =
    fromUnknownType(action) ++
    fromUnknownType(numberOfPlayers) ++
    fromUnknownType(playerUuid) ++
    fromUnknownType(playerAddName) ++
    fromUnknownType(playerAddNumberOfProperties) ++
    fromUnknownType(playerAddPropertyName) ++
    fromUnknownType(playerAddPropertyValue) ++
    fromUnknownType(playerAddPropertyIsSigned) ++
    fromUnknownType(playerAddPropertySignature) ++
    fromUnknownType(playerAddGamemode) ++
    fromUnknownType(playerAddPing) ++
    fromUnknownType(playerAddHasDisplayName) ++
    fromUnknownType(playerAddDisplayName) ++
    fromUnknownType(playerUpdateGamemode) ++
    fromUnknownType(playerUpdateLatencyPing) ++
    fromUnknownType(playerUpdateDisplayNameHas) ++
    fromUnknownType(playerUpdateDisplayName) ++
    fromUnknownType(playerRemoveNoFields)
}
