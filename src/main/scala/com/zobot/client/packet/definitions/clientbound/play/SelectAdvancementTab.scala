package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SelectAdvancementTab(hasId: UnknownType, optionalIdentifier: UnknownType) extends Packet {
  override lazy val packetId = 0x36

  override lazy val packetData: Array[Byte] =
    fromUnknownType(hasId) ++
    fromUnknownType(optionalIdentifier)
}
