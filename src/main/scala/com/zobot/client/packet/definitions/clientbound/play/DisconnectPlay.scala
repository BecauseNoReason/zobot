package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class DisconnectPlay(reason: UnknownType) extends Packet {
  override lazy val packetId = 0x1A

  override lazy val packetData: Array[Byte] =
    fromUnknownType(reason)
}
