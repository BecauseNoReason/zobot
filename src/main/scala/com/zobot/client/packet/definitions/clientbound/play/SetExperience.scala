package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SetExperience(experienceBar: Any, level: Int, totalExperience: Int) extends Packet {
  override lazy val packetId = 0x40

  override lazy val packetData: Array[Byte] =
    fromAny(experienceBar) ++
    fromVarInt(level) ++
    fromVarInt(totalExperience)
}
