package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Particle(particleId: UnknownType, longDistance: UnknownType, x: UnknownType, y: UnknownType, z: UnknownType, offsetX: UnknownType, offsetY: UnknownType, offsetZ: UnknownType, particleData: UnknownType, particleCount: UnknownType, data: UnknownType) extends Packet {
  override lazy val packetId = 0x22

  override lazy val packetData: Array[Byte] =
    fromUnknownType(particleId) ++
    fromUnknownType(longDistance) ++
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(offsetX) ++
    fromUnknownType(offsetY) ++
    fromUnknownType(offsetZ) ++
    fromUnknownType(particleData) ++
    fromUnknownType(particleCount) ++
    fromUnknownType(data)
}
