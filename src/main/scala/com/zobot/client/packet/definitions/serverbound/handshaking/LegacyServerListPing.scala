package com.zobot.client.packet.definitions.serverbound.handshaking

import com.zobot.client.packet.Packet

case class LegacyServerListPing(payload: Any) extends Packet {
  override lazy val packetId = 0xFE

  override lazy val packetData: Array[Byte] =
    fromAny(payload)
}
