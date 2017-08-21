package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityEquipment(entityId: Int, slot: Int, item: Any) extends Packet {
  override lazy val packetId = 0x3E

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromVarInt(slot) ++
    fromAny(item)
}
