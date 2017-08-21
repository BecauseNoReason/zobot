package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class UseEntity(target: Int, propertyType: Int, targetX: Any, targetY: Any, targetZ: Any, hand: Any) extends Packet {
  override lazy val packetId = 0x0B

  override lazy val packetData: Array[Byte] =
    fromVarInt(target) ++
    fromVarInt(propertyType) ++
    fromAny(targetX) ++
    fromAny(targetY) ++
    fromAny(targetZ) ++
    fromAny(hand)
}
