package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class SteerVehicle(sideways: UnknownType, forward: UnknownType, flags: UnknownType) extends Packet {
  override lazy val packetId = 0x16

  override lazy val packetData: Array[Byte] =
    fromUnknownType(sideways) ++
    fromUnknownType(forward) ++
    fromUnknownType(flags)
}
