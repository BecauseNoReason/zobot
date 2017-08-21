package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ChatMessage(jsonData: UnknownType, position: UnknownType) extends Packet {
  override lazy val packetId = 0x0F

  override lazy val packetData: Array[Byte] =
    fromUnknownType(jsonData) ++
    fromUnknownType(position)
}
