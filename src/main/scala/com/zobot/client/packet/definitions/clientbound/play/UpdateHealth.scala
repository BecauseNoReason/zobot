package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UpdateHealth(health: Any, food: Int, foodSaturation: Any) extends Packet {
  override lazy val packetId = 0x40

  override lazy val packetData: Array[Byte] =
    fromAny(health) ++
    fromVarInt(food) ++
    fromAny(foodSaturation)
}
