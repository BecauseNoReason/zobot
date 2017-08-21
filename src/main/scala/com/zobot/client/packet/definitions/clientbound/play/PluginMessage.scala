package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PluginMessage(channel: Any, data: Any) extends Packet {
  override lazy val packetId = 0x18

  override lazy val packetData: Array[Byte] =
    fromAny(channel) ++
    fromAny(data)
}
