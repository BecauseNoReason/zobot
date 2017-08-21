package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PlayerAbilities(flags: UnknownType, flyingSpeed: UnknownType, fieldOfViewModifier: UnknownType) extends Packet {
  override lazy val packetId = 0x2B

  override lazy val packetData: Array[Byte] =
    fromUnknownType(flags) ++
    fromUnknownType(flyingSpeed) ++
    fromUnknownType(fieldOfViewModifier)
}
