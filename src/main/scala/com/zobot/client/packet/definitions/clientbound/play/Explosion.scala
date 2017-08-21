package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Explosion(x: UnknownType, y: UnknownType, z: UnknownType, radius: UnknownType, recordCount: UnknownType, records: UnknownType, playerMotionX: UnknownType, playerMotionY: UnknownType, playerMotionZ: UnknownType) extends Packet {
  override lazy val packetId = 0x1C

  override lazy val packetData: Array[Byte] =
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(radius) ++
    fromUnknownType(recordCount) ++
    fromUnknownType(records) ++
    fromUnknownType(playerMotionX) ++
    fromUnknownType(playerMotionY) ++
    fromUnknownType(playerMotionZ)
}
