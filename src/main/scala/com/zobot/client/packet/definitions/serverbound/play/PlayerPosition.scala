package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerPosition(x: UnknownType, feetY: UnknownType, z: UnknownType, onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x0E

  override lazy val packetData: Array[Byte] =
    fromUnknownType(x) ++
    fromUnknownType(feetY) ++
    fromUnknownType(z) ++
    fromUnknownType(onGround)
}
