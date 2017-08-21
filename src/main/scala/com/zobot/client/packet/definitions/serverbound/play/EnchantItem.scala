package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class EnchantItem(windowId: UnknownType, enchantment: UnknownType) extends Packet {
  override lazy val packetId = 0x07

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(enchantment)
}
