package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class TeleportConfirm(teleportId: Int) extends Packet {
  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromVarInt(teleportId)
}
