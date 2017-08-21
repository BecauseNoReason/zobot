package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PluginMessage(channel: UnknownType, data: UnknownType) extends Packet {
  override lazy val packetId = 0x0A

  override lazy val packetData: Array[Byte] =
    fromUnknownType(channel) ++
    fromUnknownType(data)
}
