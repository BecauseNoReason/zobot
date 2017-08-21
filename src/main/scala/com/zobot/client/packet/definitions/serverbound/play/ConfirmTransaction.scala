package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class ConfirmTransaction(windowId: UnknownType, actionNumber: UnknownType, accepted: UnknownType) extends Packet {
  override lazy val packetId = 0x06

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(actionNumber) ++
    fromUnknownType(accepted)
}
