package com.zobot.client.packet.definitions.clientbound.status

import com.zobot.client.packet.Packet

case class Response(jsonResponse: UnknownType) extends Packet {
  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromUnknownType(jsonResponse)
}
