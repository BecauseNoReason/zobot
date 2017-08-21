package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class BossBar(uuid: Any, action: Any, addTitle: Any, addHealth: Any, addColor: Any, addDivision: Any, addFlags: Any, removeNoFields: Any, updateHealth: Any, updateTitle: Any, updateStyleColor: Any, updateStyleDividers: Any, updateFlags: Any) extends Packet {
  override lazy val packetId = 0x0C

  override lazy val packetData: Array[Byte] =
    fromAny(uuid) ++
    fromAny(action) ++
    fromAny(addTitle) ++
    fromAny(addHealth) ++
    fromAny(addColor) ++
    fromAny(addDivision) ++
    fromAny(addFlags) ++
    fromAny(removeNoFields) ++
    fromAny(updateHealth) ++
    fromAny(updateTitle) ++
    fromAny(updateStyleColor) ++
    fromAny(updateStyleDividers) ++
    fromAny(updateFlags)
}
