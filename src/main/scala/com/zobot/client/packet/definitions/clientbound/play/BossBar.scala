package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class BossBar(uuid: UnknownType, action: UnknownType, addTitle: UnknownType, addHealth: UnknownType, addColor: UnknownType, addDivision: UnknownType, addFlags: UnknownType, removeNoFields: UnknownType, updateHealth: UnknownType, updateTitle: UnknownType, updateStyleColor: UnknownType, updateStyleDividers: UnknownType, updateFlags: UnknownType) extends Packet {
  override lazy val packetId = 0x0C

  override lazy val packetData: Array[Byte] =
    fromUnknownType(uuid) ++
    fromUnknownType(action) ++
    fromUnknownType(addTitle) ++
    fromUnknownType(addHealth) ++
    fromUnknownType(addColor) ++
    fromUnknownType(addDivision) ++
    fromUnknownType(addFlags) ++
    fromUnknownType(removeNoFields) ++
    fromUnknownType(updateHealth) ++
    fromUnknownType(updateTitle) ++
    fromUnknownType(updateStyleColor) ++
    fromUnknownType(updateStyleDividers) ++
    fromUnknownType(updateFlags)
}
