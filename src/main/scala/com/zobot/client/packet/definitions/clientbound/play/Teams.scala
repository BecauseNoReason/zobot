package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Teams(teamName: UnknownType, mode: UnknownType, createTeamDisplayName: UnknownType, createTeamPrefix: UnknownType, createTeamSuffix: UnknownType, createTeamFriendlyFlags: UnknownType, createTeamNameTagVisibility: UnknownType, createTeamCollisionRule: UnknownType, createTeamColor: UnknownType, createTeamEntityCount: UnknownType, createTeamEntities: UnknownType, removeTeamNoFields: UnknownType, updateTeamInfoDisplayName: UnknownType, updateTeamInfoPrefix: UnknownType, updateTeamInfoSuffix: UnknownType, updateTeamInfoFriendlyFlags: UnknownType, updateTeamInfoNameTagVisibility: UnknownType, updateTeamInfoCollisionRule: UnknownType, updateTeamInfoColor: UnknownType, addPlayersToTeamEntityCount: UnknownType, addPlayersToTeamEntities: UnknownType, removePlayersFromTeamEntityCount: UnknownType, removePlayersFromTeamEntities: UnknownType) extends Packet {
  override lazy val packetId = 0x43

  override lazy val packetData: Array[Byte] =
    fromUnknownType(teamName) ++
    fromUnknownType(mode) ++
    fromUnknownType(createTeamDisplayName) ++
    fromUnknownType(createTeamPrefix) ++
    fromUnknownType(createTeamSuffix) ++
    fromUnknownType(createTeamFriendlyFlags) ++
    fromUnknownType(createTeamNameTagVisibility) ++
    fromUnknownType(createTeamCollisionRule) ++
    fromUnknownType(createTeamColor) ++
    fromUnknownType(createTeamEntityCount) ++
    fromUnknownType(createTeamEntities) ++
    fromUnknownType(removeTeamNoFields) ++
    fromUnknownType(updateTeamInfoDisplayName) ++
    fromUnknownType(updateTeamInfoPrefix) ++
    fromUnknownType(updateTeamInfoSuffix) ++
    fromUnknownType(updateTeamInfoFriendlyFlags) ++
    fromUnknownType(updateTeamInfoNameTagVisibility) ++
    fromUnknownType(updateTeamInfoCollisionRule) ++
    fromUnknownType(updateTeamInfoColor) ++
    fromUnknownType(addPlayersToTeamEntityCount) ++
    fromUnknownType(addPlayersToTeamEntities) ++
    fromUnknownType(removePlayersFromTeamEntityCount) ++
    fromUnknownType(removePlayersFromTeamEntities)
}
