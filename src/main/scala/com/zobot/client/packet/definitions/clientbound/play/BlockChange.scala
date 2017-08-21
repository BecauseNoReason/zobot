package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class BlockChange(location: Any, blockId: Int) extends Packet {
  override lazy val packetId = 0x0B

  override lazy val packetData: Array[Byte] =
    fromAny(location) ++
    fromVarInt(blockId)
}
