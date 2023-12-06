package com.example.pawsitivedetect.model

data class ChildComment(
    val id : String,
    val parentId : String,
    val senderId: String,

    val commentPosition : Int,
    val time: String,
    val text: String,
    val likedBy : Int,
)