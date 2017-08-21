package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class PrepareCraftingGrid(windowId: Any, actionNumber: Any, arraySize: Any, returnEntryItem: Any, returnEntryCraftingSlot: Any, returnEntryPlayerSlot: Any, arraySize: Any, prepareEntryItem: Any, prepareEntryCraftingSlot: Any, prepareEntryPlayerSlot: Any) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromAny(windowId) ++
    fromAny(actionNumber) ++
    fromAny(arraySize) ++
    fromAny(returnEntryItem) ++
    fromAny(returnEntryCraftingSlot) ++
    fromAny(returnEntryPlayerSlot) ++
    fromAny(arraySize) ++
    fromAny(prepareEntryItem) ++
    fromAny(prepareEntryCraftingSlot) ++
    fromAny(prepareEntryPlayerSlot)
}
