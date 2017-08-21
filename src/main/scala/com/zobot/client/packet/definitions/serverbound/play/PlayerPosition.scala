package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerPosition(x: Any, feetY: Any, z: Any, onGround: Any) extends Packet {
  override lazy val packetId = 0x0D

  override lazy val packetData: Array[Byte] =
    fromAny(x) ++
    fromAny(feetY) ++
    fromAny(z) ++
    fromAny(onGround)
}
