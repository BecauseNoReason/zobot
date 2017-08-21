package com.zobot.client

import akka.serialization.Serializer
import com.zobot.client.packet.definitions.serverbound.handshaking.Handshake
import com.zobot.client.packet.definitions.serverbound.login.LoginStart
import com.zobot.client.packet.definitions.serverbound.status.{Ping, Request}

import scala.collection.mutable.ArrayBuffer

package object packet {

  /**
    *
    */
  trait Packet {

    private val INT: Double = Math.pow(2, 31)
    private val MSB: Int = 0x80
    private val REST: Int = 0x7F
    private val MSBALL: Int = ~REST

    /**
      *
      */
    val packetId: Int

    /**
      *
      */
    val packetData: Array[Byte]

    /**
      *
      * @return
      */
    def buildPacket: Array[Byte] =
      fromVarInt(packetData.length + 1) ++ fromVarInt(packetId) ++ packetData

    /**
      *
      * @param x
      * @return
      */
    def fromUnsignedShort(x: Int): Array[Byte] =
      BigInt(x.toShort).toByteArray

    /**
      *
      * @param x
      * @return Array[Byte]
      */
    def fromVarInt(x: Int): Array[Byte] = {
      var number = x
      var output = ArrayBuffer[Int]()

      while (number >= INT) {
        output += number & 0xFF | MSB
        number /= 128
      }

      while ((number & MSBALL) > 0) {
        output += number & 0xFF | MSB
        number >>>= 7
      }

      output += number | 0

      output.map(_.toByte).toArray
    }

    /**
      *
      * @param x
      * @return
      */
    def fromVarString(x: String): Array[Byte] =
      fromVarInt(x.length) ++ x.getBytes

  }

  /**
    *
    */
  class PacketSerializer extends Serializer {

    override def identifier = 41
    override def includeManifest = true

    override def toBinary(obj: AnyRef): Array[Byte] = {
      obj match {
        case x: Handshake =>
          x.buildPacket

        case x: LoginStart =>
          x.buildPacket

        case x: Ping =>
          x.buildPacket

        case x: Request =>
          x.buildPacket
      }
    }

    override def fromBinary(bytes: Array[Byte], clazz: Option[Class[_]]): AnyRef = {
      //#...
      null
      //#...
    }
  }

}
