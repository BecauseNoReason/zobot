package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class NamedSoundEffect(soundName: Any, soundCategory: Int, effectPositionX: Any, effectPositionY: Any, effectPositionZ: Any, volume: Any, pitch: Any) extends Packet {
  override lazy val packetId = 0x19

  override lazy val packetData: Array[Byte] =
    fromAny(soundName) ++
    fromVarInt(soundCategory) ++
    fromAny(effectPositionX) ++
    fromAny(effectPositionY) ++
    fromAny(effectPositionZ) ++
    fromAny(volume) ++
    fromAny(pitch)
}
