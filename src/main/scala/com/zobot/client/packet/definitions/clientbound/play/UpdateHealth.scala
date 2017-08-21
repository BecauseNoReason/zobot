package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UpdateHealth(health: UnknownType, food: Int, foodSaturation: UnknownType) extends Packet {
  override lazy val packetId = 0x40

  override lazy val packetData: Array[Byte] =
    fromUnknownType(health) ++
    fromVarInt(food) ++
    fromUnknownType(foodSaturation)
}
