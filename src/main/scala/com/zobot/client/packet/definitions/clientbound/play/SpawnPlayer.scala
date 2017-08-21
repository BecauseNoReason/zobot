package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnPlayer(entityId: Int, playerUuid: UnknownType, x: UnknownType, y: UnknownType, z: UnknownType, yaw: UnknownType, pitch: UnknownType, metadata: UnknownType) extends Packet {
  override lazy val packetId = 0x05

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromUnknownType(playerUuid) ++
    fromUnknownType(x) ++
    fromUnknownType(y) ++
    fromUnknownType(z) ++
    fromUnknownType(yaw) ++
    fromUnknownType(pitch) ++
    fromUnknownType(metadata)
}
