package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Map(itemDamage: UnknownType, scale: UnknownType, trackingPosition: UnknownType, iconCount: UnknownType, iconDirectionAndType: UnknownType, iconX: UnknownType, iconZ: UnknownType, columns: UnknownType, rows: UnknownType, x: UnknownType, z: UnknownType, length: UnknownType, data: UnknownType) extends Packet {
  override lazy val packetId = 0x24

  override lazy val packetData: Array[Byte] =
    fromUnknownType(itemDamage) ++
    fromUnknownType(scale) ++
    fromUnknownType(trackingPosition) ++
    fromUnknownType(iconCount) ++
    fromUnknownType(iconDirectionAndType) ++
    fromUnknownType(iconX) ++
    fromUnknownType(iconZ) ++
    fromUnknownType(columns) ++
    fromUnknownType(rows) ++
    fromUnknownType(x) ++
    fromUnknownType(z) ++
    fromUnknownType(length) ++
    fromUnknownType(data)
}
