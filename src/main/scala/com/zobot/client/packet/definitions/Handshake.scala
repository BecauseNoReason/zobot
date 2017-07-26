package com.zobot.client.packet.definitions

import com.zobot.client.packet.Packet

/**
  *
  * @param protocolVersion
  * @param serverAddress
  * @param serverPort
  * @param nextState
  */
case class Handshake(protocolVersion: Int, serverAddress: String, serverPort: Int, nextState: Int) extends Packet {

  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromVarInt(protocolVersion) ++
    fromVarString(serverAddress) ++
    fromUnsignedShort(serverPort) ++
    fromVarInt(nextState)

}
