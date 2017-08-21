package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerPositionAndLook(x: Any, feetY: Any, z: Any, yaw: Any, pitch: Any, onGround: Any) extends Packet {
  override lazy val packetId = 0x0F

  override lazy val packetData: Array[Byte] =
    fromAny(x) ++
    fromAny(feetY) ++
    fromAny(z) ++
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(onGround)
}
