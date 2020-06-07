package com.example.notes.presentation

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Long
import kotlin.jvm.JvmStatic

data class NoteFragmentArgs(val noteId: Long = 0L) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putLong("noteId", this.noteId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): NoteFragmentArgs {
            bundle.setClassLoader(NoteFragmentArgs::class.java.classLoader)
            val __noteId : Long
            if (bundle.containsKey("noteId")) {
                __noteId = bundle.getLong("noteId")
            } else {
                __noteId = 0L
            }
            return NoteFragmentArgs(__noteId)
        }
    }
}
