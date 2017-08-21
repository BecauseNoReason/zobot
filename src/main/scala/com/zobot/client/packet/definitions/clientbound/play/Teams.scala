package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Teams(teamName: Any, mode: Any, createTeamDisplayName: Any, createTeamPrefix: Any, createTeamSuffix: Any, createTeamFriendlyFlags: Any, createTeamNameTagVisibility: Any, createTeamCollisionRule: Any, createTeamColor: Any, createTeamEntityCount: Any, createTeamEntities: Any, removeTeamNoFields: Any, updateTeamInfoDisplayName: Any, updateTeamInfoPrefix: Any, updateTeamInfoSuffix: Any, updateTeamInfoFriendlyFlags: Any, updateTeamInfoNameTagVisibility: Any, updateTeamInfoCollisionRule: Any, updateTeamInfoColor: Any, addPlayersToTeamEntityCount: Any, addPlayersToTeamEntities: Any, removePlayersFromTeamEntityCount: Any, removePlayersFromTeamEntities: Any) extends Packet {
  override lazy val packetId = 0x43

  override lazy val packetData: Array[Byte] =
    fromAny(teamName) ++
    fromAny(mode) ++
    fromAny(createTeamDisplayName) ++
    fromAny(createTeamPrefix) ++
    fromAny(createTeamSuffix) ++
    fromAny(createTeamFriendlyFlags) ++
    fromAny(createTeamNameTagVisibility) ++
    fromAny(createTeamCollisionRule) ++
    fromAny(createTeamColor) ++
    fromAny(createTeamEntityCount) ++
    fromAny(createTeamEntities) ++
    fromAny(removeTeamNoFields) ++
    fromAny(updateTeamInfoDisplayName) ++
    fromAny(updateTeamInfoPrefix) ++
    fromAny(updateTeamInfoSuffix) ++
    fromAny(updateTeamInfoFriendlyFlags) ++
    fromAny(updateTeamInfoNameTagVisibility) ++
    fromAny(updateTeamInfoCollisionRule) ++
    fromAny(updateTeamInfoColor) ++
    fromAny(addPlayersToTeamEntityCount) ++
    fromAny(addPlayersToTeamEntities) ++
    fromAny(removePlayersFromTeamEntityCount) ++
    fromAny(removePlayersFromTeamEntities)
}
