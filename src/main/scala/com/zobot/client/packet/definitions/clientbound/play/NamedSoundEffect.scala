package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class NamedSoundEffect(soundName: UnknownType, soundCategory: Int, effectPositionX: UnknownType, effectPositionY: UnknownType, effectPositionZ: UnknownType, volume: UnknownType, pitch: UnknownType) extends Packet {
  override lazy val packetId = 0x19

  override lazy val packetData: Array[Byte] =
    fromUnknownType(soundName) ++
    fromVarInt(soundCategory) ++
    fromUnknownType(effectPositionX) ++
    fromUnknownType(effectPositionY) ++
    fromUnknownType(effectPositionZ) ++
    fromUnknownType(volume) ++
    fromUnknownType(pitch)
}
