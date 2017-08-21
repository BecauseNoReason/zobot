package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PlayerPositionAndLook(x: UnknownType, y: UnknownType, z: UnknownType, yaw: UnknownType, pitch: UnknownType, flags: UnknownType, teleportId: Int) extends Packet {
  override lazy val packetId = 0x2E

  override lazy val packetData: Array[Byte] =
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(flags) ++
    fromVarInt(teleportId)
}
