package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ResourcePackSend(url: UnknownType, hash: UnknownType) extends Packet {
  override lazy val packetId = 0x33

  override lazy val packetData: Array[Byte] =
    fromUnknownType(url) ++
    fromUnknownType(hash)
}
