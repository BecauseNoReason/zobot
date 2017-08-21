package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ChatMessage(message: Any) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromAny(message)
}
