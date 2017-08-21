package com.zobot.client.packet.definitions.serverbound.login

import com.zobot.client.packet.Packet

case class LoginStart(name: String) extends Packet {
  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromVarString(name)
}
