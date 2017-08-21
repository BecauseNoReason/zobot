package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ChatMessage(message: UnknownType) extends Packet {
  override lazy val packetId = 0x03

  override lazy val packetData: Array[Byte] =
    fromUnknownType(message)
}
