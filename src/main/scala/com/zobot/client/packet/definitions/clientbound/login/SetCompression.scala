package com.zobot.client.packet.definitions.clientbound.login

import com.zobot.client.packet.Packet

case class SetCompression(threshold: Int) extends Packet {
  override lazy val packetId = 0x03

  override lazy val packetData: Array[Byte] =
    fromVarInt(threshold)
}
