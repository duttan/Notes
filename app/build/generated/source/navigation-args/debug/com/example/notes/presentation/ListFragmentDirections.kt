package com.example.notes.presentation

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.notes.R
import kotlin.Int
import kotlin.Long

class ListFragmentDirections private constructor() {
    private data class ActionGoToNote(val noteId: Long = 0L) : NavDirections {
        override fun getActionId(): Int = R.id.actionGoToNote

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putLong("noteId", this.noteId)
            return result
        }
    }

    companion object {
        fun actionGoToNote(noteId: Long = 0L): NavDirections = ActionGoToNote(noteId)
    }
}
