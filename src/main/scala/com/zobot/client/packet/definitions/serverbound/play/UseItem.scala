package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class UseItem(hand: Int) extends Packet {
  override lazy val packetId = 0x20

  override lazy val packetData: Array[Byte] =
    fromVarInt(hand)
}
