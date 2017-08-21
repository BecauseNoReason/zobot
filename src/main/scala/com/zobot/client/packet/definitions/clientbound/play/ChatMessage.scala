package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ChatMessage(jsonData: Any, position: Any) extends Packet {
  override lazy val packetId = 0x0F

  override lazy val packetData: Array[Byte] =
    fromAny(jsonData) ++
    fromAny(position)
}
