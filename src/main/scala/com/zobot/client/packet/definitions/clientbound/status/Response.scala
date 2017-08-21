package com.zobot.client.packet.definitions.clientbound.status

import com.zobot.client.packet.Packet

case class Response(jsonResponse: Any) extends Packet {
  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromAny(jsonResponse)
}
