package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class SteerVehicle(sideways: Any, forward: Any, flags: Any) extends Packet {
  override lazy val packetId = 0x16

  override lazy val packetData: Array[Byte] =
    fromAny(sideways) ++
    fromAny(forward) ++
    fromAny(flags)
}
