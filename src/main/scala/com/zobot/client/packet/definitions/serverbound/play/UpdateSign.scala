package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class UpdateSign(location: UnknownType, line1: UnknownType, line2: UnknownType, line3: UnknownType, line4: UnknownType) extends Packet {
  override lazy val packetId = 0x1C

  override lazy val packetData: Array[Byte] =
    fromUnknownType(location) ++
    fromUnknownType(line1) ++
    fromUnknownType(line2) ++
    fromUnknownType(line3) ++
    fromUnknownType(line4)
}
