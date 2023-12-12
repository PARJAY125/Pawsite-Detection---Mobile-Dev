package com.example.pawsitivedetect.model

data class ParentComment(
    override val id : String,
    override val senderId: String,

    override val commentPosition : Int,
    override val time: String,
    override val text: String,
    override val likedBy : Int,

    val childComment : ArrayList<ChildComment>
) : IComment