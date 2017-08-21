package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityEffect(entityId: Int, effectId: UnknownType, amplifier: UnknownType, duration: Int, flags: UnknownType) extends Packet {
  override lazy val packetId = 0x4E

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(effectId) ++
    fromUnknownType(amplifier) ++
    fromVarInt(duration) ++
    fromUnknownType(flags)
}
