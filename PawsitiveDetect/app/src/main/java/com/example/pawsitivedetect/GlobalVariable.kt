package com.example.pawsitivedetect

import com.example.pawsitivedetect.model.Author
import com.example.pawsitivedetect.model.Message

// TODO : REPLACE LATER
class GlobalVariable {
    companion object {
        val myId = "Parjay"

        val author = listOf(
            Author(myId, "Parjay"),
            Author("Not Me", "Bot")
        )

        val sampleMessages = listOf(
            Message("Hello!", "12:30 PM", author[0]),
            Message("Hi there!", "12:31 PM", author[1]),
            Message("How are you?", "12:32 PM", author[0]),
            Message("I'm good, thank you!", "12:33 PM", author[1]),
        )
    }
}