package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class TabComplete(text: UnknownType, assumeCommand: UnknownType, hasPosition: UnknownType, lookedAtBlock: UnknownType) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromUnknownType(text) ++
    fromUnknownType(assumeCommand) ++
    fromUnknownType(hasPosition) ++
    fromUnknownType(lookedAtBlock)
}
