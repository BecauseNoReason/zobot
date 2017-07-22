package com.zobot.client.packet.deffinitions

import com.zobot.client.packet.Packet

/**
  *
  * @param name
  */
case class LoginStart(name: String) extends Packet {

  override lazy val packetId = 0x00

  override lazy val packetData: Array[Byte] =
    toVarString(name)

}
