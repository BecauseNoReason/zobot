package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ConfirmTransaction(windowId: Any, actionNumber: Any, accepted: Any) extends Packet {
  override lazy val packetId = 0x05

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(actionNumber) ++
    fromAny(accepted)
}
