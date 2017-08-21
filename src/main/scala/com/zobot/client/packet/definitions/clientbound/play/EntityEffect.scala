package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class EntityEffect(entityId: Int, effectId: Any, amplifier: Any, duration: Int, flags: Any) extends Packet {
  override lazy val packetId = 0x4E

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(effectId) ++
    fromAny(amplifier) ++
    fromVarInt(duration) ++
    fromAny(flags)
}
