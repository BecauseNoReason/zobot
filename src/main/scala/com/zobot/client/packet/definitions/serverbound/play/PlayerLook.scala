package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerLook(yaw: UnknownType, pitch: UnknownType, onGround: UnknownType) extends Packet {
  override lazy val packetId = 0x10

  override lazy val packetData: Array[Byte] =
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(onGround)
}
