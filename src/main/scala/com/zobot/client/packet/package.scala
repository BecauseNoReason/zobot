package com.zobot.client

import akka.serialization.Serializer
import com.zobot.client.packet.models.Handshake

package object packet {

  class PacketSerializer extends Serializer {

    override def includeManifest: Boolean = true

    override def identifier = 41

    override def toBinary(obj: AnyRef): Array[Byte] = {
      obj match {
        case h: Handshake => h.toByteArray
      }
    }

    override def fromBinary(bytes: Array[Byte], clazz: Option[Class[_]]): AnyRef = {
      //#...
      null
      //#...
    }
  }

}
