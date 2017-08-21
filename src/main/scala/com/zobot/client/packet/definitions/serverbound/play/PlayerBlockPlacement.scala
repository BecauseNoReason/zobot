package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PlayerBlockPlacement(location: Any, face: Int, hand: Int, cursorPositionX: Any, cursorPositionY: Any, cursorPositionZ: Any) extends Packet {
  override lazy val packetId = 0x1F

  override lazy val packetData: Array[Byte] =
    fromAny(location) ++
    fromVarInt(face) ++
    fromVarInt(hand) ++
    fromAny(cursorPositionX) ++
    fromAny(cursorPositionY) ++
    fromAny(cursorPositionZ)
}
