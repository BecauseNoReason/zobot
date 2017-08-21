package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class CloseWindow(windowId: UnknownType) extends Packet {
  override lazy val packetId = 0x09

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId)
}
