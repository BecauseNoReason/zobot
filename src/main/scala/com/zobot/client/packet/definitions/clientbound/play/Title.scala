package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Title(action: Any, setTitleText: Any, setSubtitleText: Any, setActionBarText: Any, setTimesAndDisplayFadeIn: Any, setTimesAndDisplayStay: Any, setTimesAndDisplayFadeOut: Any, hideNoFields: Any, resetNoFields: Any) extends Packet {
  override lazy val packetId = 0x48

  override lazy val packetData: Array[Byte] =
    fromAny(action) ++
    fromAny(setTitleText) ++
    fromAny(setSubtitleText) ++
    fromAny(setActionBarText) ++
    fromAny(setTimesAndDisplayFadeIn) ++
    fromAny(setTimesAndDisplayStay) ++
    fromAny(setTimesAndDisplayFadeOut) ++
    fromAny(hideNoFields) ++
    fromAny(resetNoFields)
}
