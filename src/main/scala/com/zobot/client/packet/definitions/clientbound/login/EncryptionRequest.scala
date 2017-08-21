package com.zobot.client.packet.definitions.clientbound.login

import com.zobot.client.packet.Packet

case class EncryptionRequest(serverId: UnknownType, publicKeyLength: Int, publicKey: UnknownType, verifyTokenLength: Int, verifyToken: UnknownType) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromUnknownType(serverId) ++
    fromVarInt(publicKeyLength) ++
    fromUnknownType(publicKey) ++
    fromVarInt(verifyTokenLength) ++
    fromUnknownType(verifyToken)
}
