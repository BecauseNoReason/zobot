package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SoundEffect(soundId: Int, soundCategory: Int, effectPositionX: Any, effectPositionY: Any, effectPositionZ: Any, volume: Any, pitch: Any) extends Packet {
  override lazy val packetId = 0x48

  override lazy val packetData: Array[Byte] =
    fromVarInt(soundId) ++
    fromVarInt(soundCategory) ++
    fromAny(effectPositionX) ++
    fromAny(effectPositionY) ++
    fromAny(effectPositionZ) ++
    fromAny(volume) ++
    fromAny(pitch)
}
