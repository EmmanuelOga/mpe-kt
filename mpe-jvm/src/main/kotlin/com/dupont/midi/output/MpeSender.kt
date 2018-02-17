@file:JvmName("MpeSenderFactory")
package com.dupont.midi.output

actual interface MpeSender {
    actual fun addNewNote(note: Int, velocity: Int, zoneId: Int?): FingerOutput?
    actual var rawMidiListener: RawMidiListener?
}

actual fun create() = createInternal()