package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class WorldBorder(action: UnknownType, setSizeDiameter: UnknownType, lerpSizeOldDiameter: UnknownType, lerpSizeNewDiameter: UnknownType, lerpSizeSpeed: UnknownType, setCenterX: UnknownType, setCenterZ: UnknownType, initializeX: UnknownType, initializeZ: UnknownType, initializeOldDiameter: UnknownType, initializeNewDiameter: UnknownType, initializeSpeed: UnknownType, initializePortalTeleportBoundary: UnknownType, initializeWarningTime: UnknownType, initializeWarningBlocks: UnknownType, setWarningTime: UnknownType, setWarningBlocks: UnknownType) extends Packet {
  override lazy val packetId = 0x37

  override lazy val packetData: Array[Byte] =
    fromUnknownType(action) ++
    fromUnknownType(setSizeDiameter) ++
    fromUnknownType(lerpSizeOldDiameter) ++
    fromUnknownType(lerpSizeNewDiameter) ++
    fromUnknownType(lerpSizeSpeed) ++
    fromUnknownType(setCenterX) ++
    fromUnknownType(setCenterZ) ++
    fromUnknownType(initializeX) ++
    fromUnknownType(initializeZ) ++
    fromUnknownType(initializeOldDiameter) ++
    fromUnknownType(initializeNewDiameter) ++
    fromUnknownType(initializeSpeed) ++
    fromUnknownType(initializePortalTeleportBoundary) ++
    fromUnknownType(initializeWarningTime) ++
    fromUnknownType(initializeWarningBlocks) ++
    fromUnknownType(setWarningTime) ++
    fromUnknownType(setWarningBlocks)
}
