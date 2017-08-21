package com.zobot.client.packet.definitions.clientbound.login

import com.zobot.client.packet.Packet

case class DisconnectLogin(reason: Any) extends Packet {
  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    fromAny(reason)
}
