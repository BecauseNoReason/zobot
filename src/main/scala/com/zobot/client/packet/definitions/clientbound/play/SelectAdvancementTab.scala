package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SelectAdvancementTab(hasId: Any, optionalIdentifier: Any) extends Packet {
  override lazy val packetId = 0x36

  override lazy val packetData: Array[Byte] =
    fromAny(hasId) ++
    fromAny(optionalIdentifier)
}
