package com.example.pawsitivedetect.model

data class Chat(
    val text: String,
    val time: String,
    val isUnread : Boolean,
    val isFromMe : Boolean
)