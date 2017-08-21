package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class PlayerListHeaderAndFooter(header: UnknownType, footer: UnknownType) extends Packet {
  override lazy val packetId = 0x49

  override lazy val packetData: Array[Byte] =
    fromUnknownType(header) ++
    fromUnknownType(footer)
}
