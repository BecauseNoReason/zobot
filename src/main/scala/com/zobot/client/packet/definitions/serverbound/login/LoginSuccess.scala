package com.zobot.client.packet.definitions.serverbound.login

import com.zobot.client.packet.Packet

/**
  *
  * @param uuid
  * @param username
  */
case class LoginSuccess(uuid: String, username: String) extends Packet {
  override lazy val packetId = 0x02

  override lazy val packetData: Array[Byte] =
    fromVarString(uuid) ++
    fromVarString(username)
}
