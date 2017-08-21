package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ClientStatus(actionId: Int) extends Packet {
  override lazy val packetId = 0x03

  override lazy val packetData: Array[Byte] =
    fromVarInt(actionId)
}
