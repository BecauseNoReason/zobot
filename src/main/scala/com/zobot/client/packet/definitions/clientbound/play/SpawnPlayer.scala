package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class SpawnPlayer(entityId: Int, playerUuid: Any, x: Any, y: Any, z: Any, yaw: Any, pitch: Any, metadata: Any) extends Packet {
  override lazy val packetId = 0x05

  override lazy val packetData: Array[Byte] =
    fromVarInt(entityId) ++
    fromAny(playerUuid) ++
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(yaw) ++
    fromAny(pitch) ++
    fromAny(metadata)
}
