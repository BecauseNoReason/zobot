package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class Map(itemDamage: Any, scale: Any, trackingPosition: Any, iconCount: Any, iconDirectionAndType: Any, iconX: Any, iconZ: Any, columns: Any, rows: Any, x: Any, z: Any, length: Any, data: Any) extends Packet {
  override lazy val packetId = 0x24

  override lazy val packetData: Array[Byte] =
    fromAny(itemDamage) ++
    fromAny(scale) ++
    fromAny(trackingPosition) ++
    fromAny(iconCount) ++
    fromAny(iconDirectionAndType) ++
    fromAny(iconX) ++
    fromAny(iconZ) ++
    fromAny(columns) ++
    fromAny(rows) ++
    fromAny(x) ++
    fromAny(z) ++
    fromAny(length) ++
    fromAny(data)
}
