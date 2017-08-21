package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerAbilities(flags: UnknownType, flyingSpeed: UnknownType, walkingSpeed: UnknownType) extends Packet {
  override lazy val packetId = 0x13

  override lazy val packetData: Array[Byte] =
    fromUnknownType(flags) ++
    fromUnknownType(flyingSpeed) ++
    fromUnknownType(walkingSpeed)
}
