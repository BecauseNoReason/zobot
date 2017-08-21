package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PlayerPositionAndLook(x: Any, y: Any, z: Any, yaw: Any, pitch: Any, flags: Any, teleportId: Int) extends Packet {
  override lazy val packetId = 0x2F

  override lazy val packetData: Array[Byte] =
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(flags) ++
    fromVarInt(teleportId)
}
