package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityProperties(entityId: Any, numberOfProperties: Any, propertyKey: Any, propertyValue: Any, propertyNumberOfModifiers: Any, propertyModifiers: Any) extends Packet {
  override lazy val packetId = 0x4D

  override lazy val packetData: Array[Byte] =
    fromAny(entityId) ++
    fromAny(numberOfProperties) ++
    fromAny(propertyKey) ++
    fromAny(propertyValue) ++
    fromAny(propertyNumberOfModifiers) ++
    fromAny(propertyModifiers)
}
