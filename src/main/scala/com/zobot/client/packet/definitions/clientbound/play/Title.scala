package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Title(action: UnknownType, setTitleText: UnknownType, setSubtitleText: UnknownType, setActionBarText: UnknownType, setTimesAndDisplayFadeIn: UnknownType, setTimesAndDisplayStay: UnknownType, setTimesAndDisplayFadeOut: UnknownType, hideNoFields: UnknownType, resetNoFields: UnknownType) extends Packet {
  override lazy val packetId = 0x47

  override lazy val packetData: Array[Byte] =
    fromUnknownType(action) ++
    fromUnknownType(setTitleText) ++
    fromUnknownType(setSubtitleText) ++
    fromUnknownType(setActionBarText) ++
    fromUnknownType(setTimesAndDisplayFadeIn) ++
    fromUnknownType(setTimesAndDisplayStay) ++
    fromUnknownType(setTimesAndDisplayFadeOut) ++
    fromUnknownType(hideNoFields) ++
    fromUnknownType(resetNoFields)
}
