package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Entity(entityId: Int) extends Packet {
  override lazy val packetId = 0x25

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId)
}
