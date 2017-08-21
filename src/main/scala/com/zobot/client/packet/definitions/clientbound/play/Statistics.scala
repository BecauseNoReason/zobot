package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Statistics(count: UnknownType, statisticName: UnknownType, statisticValue: UnknownType) extends Packet {
  override lazy val packetId = 0x07

  override lazy val packetData: Array[Byte] =
    fromUnknownType(count) ++
    fromUnknownType(statisticName) ++
    fromUnknownType(statisticValue)
}
