package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class VehicleMove(x: UnknownType, y: UnknownType, z: UnknownType, yaw: UnknownType, pitch: UnknownType) extends Packet {
  override lazy val packetId = 0x29

  override lazy val packetData: Array[Byte] =
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch)
}
