package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerBlockPlacement(location: UnknownType, face: Int, hand: Int, cursorPositionX: UnknownType, cursorPositionY: UnknownType, cursorPositionZ: UnknownType) extends Packet {
  override lazy val packetId = 0x1F

  override lazy val packetData: Array[Byte] =
    fromUnknownType(location) ++
    fromVarInt(face) ++
    fromVarInt(hand) ++
    fromUnknownType(cursorPositionX) ++
    fromUnknownType(cursorPositionY) ++
    fromUnknownType(cursorPositionZ)
}
