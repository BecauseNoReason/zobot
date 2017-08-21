package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class SteerBoat(rightPaddleTurning: Any) extends Packet {
  override lazy val packetId = 0x12

  override lazy val packetData: Array[Byte] =
    fromAny(rightPaddleTurning)
}
