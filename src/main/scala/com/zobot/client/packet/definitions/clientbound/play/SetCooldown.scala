package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SetCooldown(itemId: Int, cooldownTicks: Int) extends Packet {
  override lazy val packetId = 0x17

  override lazy val packetData: Array[Byte] =
    fromVarInt(itemId) ++
    fromVarInt(cooldownTicks)
}
