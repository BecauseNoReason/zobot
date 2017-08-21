package com.zobot.client.packet.definitions.serverbound.login

import com.zobot.client.packet.Packet

case class EncryptionResponse(sharedSecretLength: Int, sharedSecret: UnknownType, verifyTokenLength: Int, verifyToken: UnknownType) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromVarInt(sharedSecretLength) ++
    fromUnknownType(sharedSecret) ++
    fromVarInt(verifyTokenLength) ++
    fromUnknownType(verifyToken)
}
