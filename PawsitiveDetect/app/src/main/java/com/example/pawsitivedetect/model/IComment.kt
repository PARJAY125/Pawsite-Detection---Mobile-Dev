package com.example.pawsitivedetect.model

interface IComment {
    val id : String
    val senderId: String

    val commentPosition : Int
    val time: String
    val text: String
    val likedBy : Int
}