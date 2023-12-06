package com.example.pawsitivedetect.model

data class PersonalChat(
    val id : String,
    val interlocutorsId: String,
    val chatList : List<Chat>
)