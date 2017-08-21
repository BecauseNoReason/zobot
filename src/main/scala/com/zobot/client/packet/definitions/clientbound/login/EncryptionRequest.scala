package com.zobot.client.packet.definitions.clientbound.login

import com.zobot.client.packet.Packet

case class EncryptionRequest(serverId: Any, publicKeyLength: Int, publicKey: Any, verifyTokenLength: Int, verifyToken: Any) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromAny(serverId) ++
    fromVarInt(publicKeyLength) ++
    fromAny(publicKey) ++
    fromVarInt(verifyTokenLength) ++
    fromAny(verifyToken)
}
