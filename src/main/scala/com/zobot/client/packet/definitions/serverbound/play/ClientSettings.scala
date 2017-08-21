package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ClientSettings(locale: String, viewDistance: UnknownType, chatMode: Int, chatColors: UnknownType, displayedSkinParts: UnknownType, mainHand: Int) extends Packet {
  override lazy val packetId = 0x05

  override lazy val packetData: Array[Byte] =
    fromVarString(locale) ++
    fromUnknownType(viewDistance) ++
    fromVarInt(chatMode) ++
    fromUnknownType(chatColors) ++
    fromUnknownType(displayedSkinParts) ++
    fromVarInt(mainHand)
}
