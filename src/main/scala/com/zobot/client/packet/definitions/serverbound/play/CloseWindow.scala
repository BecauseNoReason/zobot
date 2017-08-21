package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class CloseWindow(windowId: Any) extends Packet {
  override lazy val packetId = 0x08

  override lazy val packetData: Array[Byte] =
    fromAny(windowId)
}
