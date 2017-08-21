package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerLook(yaw: Any, pitch: Any, onGround: Any) extends Packet {
  override lazy val packetId = 0x0F

  override lazy val packetData: Array[Byte] =
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(onGround)
}
