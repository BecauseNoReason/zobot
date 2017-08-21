package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ClientSettings(locale: String, viewDistance: Any, chatMode: Int, chatColors: Any, displayedSkinParts: Any, mainHand: Int) extends Packet {
  override lazy val packetId = 0x04

  override lazy val packetData: Array[Byte] =
    fromVarString(locale) ++
    fromAny(viewDistance) ++
    fromVarInt(chatMode) ++
    fromAny(chatColors) ++
    fromAny(displayedSkinParts) ++
    fromVarInt(mainHand)
}
