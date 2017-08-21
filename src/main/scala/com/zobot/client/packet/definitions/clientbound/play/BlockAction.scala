package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class BlockAction(location: Any, actionIdByte1: Any, actionParamByte2: Any, blockType: Int) extends Packet {
  override lazy val packetId = 0x0A

  override lazy val packetData: Array[Byte] =
    fromAny(location) ++
    fromAny(actionIdByte1) ++
    fromAny(actionParamByte2) ++
    fromVarInt(blockType)
}
