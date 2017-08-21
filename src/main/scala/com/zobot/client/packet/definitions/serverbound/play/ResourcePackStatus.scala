package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ResourcePackStatus(result: Int) extends Packet {
  override lazy val packetId = 0x18

  override lazy val packetData: Array[Byte] =
    fromVarInt(result)
}
