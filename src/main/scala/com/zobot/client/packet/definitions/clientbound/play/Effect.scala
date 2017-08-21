package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Effect(effectId: UnknownType, location: UnknownType, data: UnknownType, disableRelativeVolume: UnknownType) extends Packet {
  override lazy val packetId = 0x21

  override lazy val packetData: Array[Byte] =
    fromUnknownType(effectId) ++
    fromUnknownType(location) ++
    fromUnknownType(data) ++
    fromUnknownType(disableRelativeVolume)
}
