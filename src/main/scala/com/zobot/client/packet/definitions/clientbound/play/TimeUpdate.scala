package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class TimeUpdate(worldAge: UnknownType, timeOfDay: UnknownType) extends Packet {
  override lazy val packetId = 0x46

  override lazy val packetData: Array[Byte] =
    fromUnknownType(worldAge) ++
    fromUnknownType(timeOfDay)
}
