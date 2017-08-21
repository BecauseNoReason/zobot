package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Effect(effectId: Any, location: Any, data: Any, disableRelativeVolume: Any) extends Packet {
  override lazy val packetId = 0x21

  override lazy val packetData: Array[Byte] =
    fromAny(effectId) ++
    fromAny(location) ++
    fromAny(data) ++
    fromAny(disableRelativeVolume)
}
