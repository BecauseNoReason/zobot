package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Explosion(x: Any, y: Any, z: Any, radius: Any, recordCount: Any, records: Any, playerMotionX: Any, playerMotionY: Any, playerMotionZ: Any) extends Packet {
  override lazy val packetId = 0x1C

  override lazy val packetData: Array[Byte] =
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(radius) ++
    fromAny(recordCount) ++
    fromAny(records) ++
    fromAny(playerMotionX) ++
    fromAny(playerMotionY) ++
    fromAny(playerMotionZ)
}
