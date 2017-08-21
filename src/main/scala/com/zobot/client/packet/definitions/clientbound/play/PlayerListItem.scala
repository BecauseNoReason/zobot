package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PlayerListItem(action: Any, numberOfPlayers: Any, playerUuid: Any, playerAddName: Any, playerAddNumberOfProperties: Any, playerAddPropertyArrayNameString32767: Any, playerAddPropertyArrayValue: Any, playerAddPropertyArrayIsSigned: Any, playerAddPropertyArraySignature: Any, playerAddGamemode: Any, playerAddPing: Any, playerAddHasDisplayName: Any, playerAddDisplayName: Any, playerUpdateGamemode: Any, playerUpdateLatencyPing: Any, playerUpdateDisplayNameHas: Any, playerUpdateDisplayName: Any, playerRemoveNoFields: Any) extends Packet {
  override lazy val packetId = 0x2E

  override lazy val packetData: Array[Byte] =
    fromAny(action) ++
    fromAny(numberOfPlayers) ++
    fromAny(playerUuid) ++
    fromAny(playerAddName) ++
    fromAny(playerAddNumberOfProperties) ++
    fromAny(playerAddPropertyArrayNameString32767) ++
    fromAny(playerAddPropertyArrayValue) ++
    fromAny(playerAddPropertyArrayIsSigned) ++
    fromAny(playerAddPropertyArraySignature) ++
    fromAny(playerAddGamemode) ++
    fromAny(playerAddPing) ++
    fromAny(playerAddHasDisplayName) ++
    fromAny(playerAddDisplayName) ++
    fromAny(playerUpdateGamemode) ++
    fromAny(playerUpdateLatencyPing) ++
    fromAny(playerUpdateDisplayNameHas) ++
    fromAny(playerUpdateDisplayName) ++
    fromAny(playerRemoveNoFields)
}
