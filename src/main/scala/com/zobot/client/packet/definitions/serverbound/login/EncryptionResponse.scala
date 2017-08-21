package com.zobot.client.packet.definitions.serverbound.login

import com.zobot.client.packet.Packet

case class EncryptionResponse(sharedSecretLength: Int, sharedSecret: Any, verifyTokenLength: Int, verifyToken: Any) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromVarInt(sharedSecretLength) ++
    fromAny(sharedSecret) ++
    fromVarInt(verifyTokenLength) ++
    fromAny(verifyToken)
}
