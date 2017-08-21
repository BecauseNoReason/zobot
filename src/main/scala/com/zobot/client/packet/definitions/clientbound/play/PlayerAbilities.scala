package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PlayerAbilities(flags: Any, flyingSpeed: Any, fieldOfViewModifier: Any) extends Packet {
  override lazy val packetId = 0x2B

  override lazy val packetData: Array[Byte] =
    fromAny(flags) ++
    fromAny(flyingSpeed) ++
    fromAny(fieldOfViewModifier)
}
