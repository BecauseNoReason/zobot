package com.zobot.client.packet.definitions.clientbound.login

import com.zobot.client.packet.Packet

case class LoginSuccess(uuid: Any, username: String) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromAny(uuid) ++
    fromVarString(username)
}
