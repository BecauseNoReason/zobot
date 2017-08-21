package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class TabComplete(count: Int, matches: Any) extends Packet {
  override lazy val packetId = 0x0E

  override lazy val packetData: Array[Byte] =
    fromVarInt(count) ++
    fromAny(matches)
}
