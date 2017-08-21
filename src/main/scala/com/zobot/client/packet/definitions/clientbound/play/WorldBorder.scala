package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class WorldBorder(action: Any, setSizeDiameter: Any, lerpSizeOldDiameter: Any, lerpSizeNewDiameter: Any, lerpSizeSpeed: Any, setCenterX: Any, setCenterZ: Any, initializeX: Any, initializeZ: Any, initializeOldDiameter: Any, initializeNewDiameter: Any, initializeSpeed: Any, initializePortalTeleportBoundary: Any, initializeWarningTime: Any, initializeWarningBlocks: Any, setWarningTime: Any, setWarningBlocks: Any) extends Packet {
  override lazy val packetId = 0x38

  override lazy val packetData: Array[Byte] =
    fromAny(action) ++
    fromAny(setSizeDiameter) ++
    fromAny(lerpSizeOldDiameter) ++
    fromAny(lerpSizeNewDiameter) ++
    fromAny(lerpSizeSpeed) ++
    fromAny(setCenterX) ++
    fromAny(setCenterZ) ++
    fromAny(initializeX) ++
    fromAny(initializeZ) ++
    fromAny(initializeOldDiameter) ++
    fromAny(initializeNewDiameter) ++
    fromAny(initializeSpeed) ++
    fromAny(initializePortalTeleportBoundary) ++
    fromAny(initializeWarningTime) ++
    fromAny(initializeWarningBlocks) ++
    fromAny(setWarningTime) ++
    fromAny(setWarningBlocks)
}
