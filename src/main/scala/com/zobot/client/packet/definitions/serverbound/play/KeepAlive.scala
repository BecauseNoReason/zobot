package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class KeepAlive(keepAliveId: Int) extends Packet {
  override lazy val packetId = 0x0B

  override lazy val packetData: Array[Byte] =
    fromVarInt(keepAliveId)
}
