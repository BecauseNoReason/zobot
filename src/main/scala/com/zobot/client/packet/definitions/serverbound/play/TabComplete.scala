package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class TabComplete(text: Any, assumeCommand: Any, hasPosition: Any, lookedAtBlock: Any) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromAny(text) ++
    fromAny(assumeCommand) ++
    fromAny(hasPosition) ++
    fromAny(lookedAtBlock)
}
