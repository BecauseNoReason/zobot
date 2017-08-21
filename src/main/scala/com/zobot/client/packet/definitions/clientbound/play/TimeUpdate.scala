package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class TimeUpdate(worldAge: Any, timeOfDay: Any) extends Packet {
  override lazy val packetId = 0x47

  override lazy val packetData: Array[Byte] =
    fromAny(worldAge) ++
    fromAny(timeOfDay)
}
