package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class UseEntity(target: Int, propertyType: Int, targetX: UnknownType, targetY: UnknownType, targetZ: UnknownType, hand: UnknownType) extends Packet {
  override lazy val packetId = 0x0B

  override lazy val packetData: Array[Byte] =
    fromVarInt(target) ++
    fromVarInt(propertyType) ++
    fromUnknownType(targetX) ++
    fromUnknownType(targetY) ++
    fromUnknownType(targetZ) ++
    fromUnknownType(hand)
}
