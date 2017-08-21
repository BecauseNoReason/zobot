package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class EnchantItem(windowId: Any, enchantment: Any) extends Packet {
  override lazy val packetId = 0x07

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(enchantment)
}
