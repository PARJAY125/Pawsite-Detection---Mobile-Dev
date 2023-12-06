package com.example.pawsitivedetect.model

data class ParentComment(
    val id : String,
    val senderId: String,

    val commentPosition : Int,
    val time: String,
    val text: String,
    val likedBy : Int,

    val childComment : ArrayList<ChildComment>
)