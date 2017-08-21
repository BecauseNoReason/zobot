package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerPositionAndLook(x: UnknownType, feetY: UnknownType, z: UnknownType, yaw: UnknownType, pitch: UnknownType, onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x0F

  override lazy val packetData: Array[Byte] =
    fromUnknownType(x) ++
    fromUnknownType(feetY) ++
    fromUnknownType(z) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(onGround)
}
