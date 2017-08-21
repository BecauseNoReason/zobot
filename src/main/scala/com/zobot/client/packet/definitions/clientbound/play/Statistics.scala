package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Statistics(count: Any, statisticName: Any, statisticValue: Any) extends Packet {
  override lazy val packetId = 0x07

  override lazy val packetData: Array[Byte] =
    fromAny(count) ++
    fromAny(statisticName) ++
    fromAny(statisticValue)
}
