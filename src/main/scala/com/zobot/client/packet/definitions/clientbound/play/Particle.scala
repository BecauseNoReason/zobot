package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Particle(particleId: Any, longDistance: Any, x: Any, y: Any, z: Any, offsetX: Any, offsetY: Any, offsetZ: Any, particleData: Any, particleCount: Any, data: Any) extends Packet {
  override lazy val packetId = 0x22

  override lazy val packetData: Array[Byte] =
    fromAny(particleId) ++
    fromAny(longDistance) ++
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(offsetX) ++
    fromAny(offsetY) ++
    fromAny(offsetZ) ++
    fromAny(particleData) ++
    fromAny(particleCount) ++
    fromAny(data)
}
