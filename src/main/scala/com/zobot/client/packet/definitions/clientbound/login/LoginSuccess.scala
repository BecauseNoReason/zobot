package com.zobot.client.packet.definitions.clientbound.login

import com.zobot.client.packet.Packet

case class LoginSuccess(uuid: UnknownType, username: String) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromUnknownType(uuid) ++
    fromVarString(username)
}
