package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PrepareCraftingGrid(windowId: UnknownType, actionNumber: UnknownType, arraySize: UnknownType, returnEntryItem: UnknownType, returnEntryCraftingSlot: UnknownType, returnEntryPlayerSlot: UnknownType, arraySize: UnknownType, prepareEntryItem: UnknownType, prepareEntryCraftingSlot: UnknownType, prepareEntryPlayerSlot: UnknownType) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromUnknownType(windowId) ++
    fromUnknownType(actionNumber) ++
    fromUnknownType(arraySize) ++
    fromUnknownType(returnEntryItem) ++
    fromUnknownType(returnEntryCraftingSlot) ++
    fromUnknownType(returnEntryPlayerSlot) ++
    fromUnknownType(arraySize) ++
    fromUnknownType(prepareEntryItem) ++
    fromUnknownType(prepareEntryCraftingSlot) ++
    fromUnknownType(prepareEntryPlayerSlot)
}
