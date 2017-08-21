package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SetPassengers(entityId: Int, passengerCount: Int, passengers: Any) extends Packet {
  override lazy val packetId = 0x42

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromVarInt(passengerCount) ++
    fromAny(passengers)
}
