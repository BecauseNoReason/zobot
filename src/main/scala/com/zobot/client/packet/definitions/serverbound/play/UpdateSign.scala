package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class UpdateSign(location: Any, line1: Any, line2: Any, line3: Any, line4: Any) extends Packet {
  override lazy val packetId = 0x1C

  override lazy val packetData: Array[Byte] =
    fromAny(location) ++
    fromAny(line1) ++
    fromAny(line2) ++
    fromAny(line3) ++
    fromAny(line4)
}
