package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityProperties(entityId: UnknownType, numberOfProperties: UnknownType, propertyKey: UnknownType, propertyValue: UnknownType, propertyNumberOfModifiers: UnknownType, propertyModifiers: UnknownType) extends Packet {
  override lazy val packetId = 0x4D

  override lazy val packetData: Array[Byte] =
    fromUnknownType(entityId) ++
    fromUnknownType(numberOfProperties) ++
    fromUnknownType(propertyKey) ++
    fromUnknownType(propertyValue) ++
    fromUnknownType(propertyNumberOfModifiers) ++
    fromUnknownType(propertyModifiers)
}
