package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class AdvancementTab(action: UnknownType, tabId: UnknownType) extends Packet {
  override lazy val packetId = 0x19

  override lazy val packetData: Array[Byte] =
    fromUnknownType(action) ++
    fromUnknownType(tabId)
}
