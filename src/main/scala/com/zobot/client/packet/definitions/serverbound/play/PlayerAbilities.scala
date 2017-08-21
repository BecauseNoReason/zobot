package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerAbilities(flags: Any, flyingSpeed: Any, walkingSpeed: Any) extends Packet {
  override lazy val packetId = 0x13

  override lazy val packetData: Array[Byte] =
    fromAny(flags) ++
    fromAny(flyingSpeed) ++
    fromAny(walkingSpeed)
}
