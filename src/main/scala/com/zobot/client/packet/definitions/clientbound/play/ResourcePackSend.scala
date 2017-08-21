package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class ResourcePackSend(url: Any, hash: Any) extends Packet {
  override lazy val packetId = 0x33

  override lazy val packetData: Array[Byte] =
    fromAny(url) ++
    fromAny(hash)
}
