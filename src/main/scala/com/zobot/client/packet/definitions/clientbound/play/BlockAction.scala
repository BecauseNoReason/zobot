package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class BlockAction(location: UnknownType, actionIdByte1: UnknownType, actionParamByte2: UnknownType, blockType: Int) extends Packet {
  override lazy val packetId = 0x0A

  override lazy val packetData: Array[Byte] =
    fromUnknownType(location) ++
    fromUnknownType(actionIdByte1) ++
    fromUnknownType(actionParamByte2) ++
    fromVarInt(blockType)
}
