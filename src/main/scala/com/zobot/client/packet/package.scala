package com.zobot.client

import akka.serialization.Serializer
import com.zobot.client.packet.deffinitions.{Handshake, LoginStart, Ping, Request}

import scala.collection.mutable.ArrayBuffer

package object packet {

  trait Packet {

    private val INT: Double = Math.pow(2, 31)
    private val MSB: Int = 0x80
    private val REST: Int = 0x7F
    private val MSBALL: Int = ~REST

    val packetId: Int
    val packetData: Array[Byte]

    def buildPacket: Array[Byte] =
      toVarInt(packetData.length + 1) ++ toVarInt(packetId) ++ packetData

    def toUnsignedShort(x: Int): Array[Byte] =
      BigInt(x.toShort).toByteArray

    def toVarInt(x: Int): Array[Byte] = {
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

    def toVarString(x: String): Array[Byte] =
      toVarInt(x.length) ++ x.getBytes

  }

  class PacketSerializer extends Serializer {

    override def includeManifest: Boolean = true

    override def identifier = 41

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
