package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class CollectItem(collectedEntityId: Int, collectorEntityId: Int, pickupItemCount: Int) extends Packet {
  override lazy val packetId = 0x4B

  override lazy val packetData: Array[Byte] =
    fromVarInt(collectedEntityId) ++
    fromVarInt(collectorEntityId) ++
    fromVarInt(pickupItemCount)
}
