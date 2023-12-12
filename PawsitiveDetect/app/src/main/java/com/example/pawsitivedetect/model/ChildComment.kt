package com.example.pawsitivedetect.model

data class ChildComment(
    override val id : String,
    val parentId : String,
    override val senderId: String,

    override val commentPosition : Int,
    override val time: String,
    override val text: String,
    override val likedBy : Int,
) : IComment