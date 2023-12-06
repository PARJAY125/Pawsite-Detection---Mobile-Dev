package com.example.pawsitivedetect.model

data class User(
    val id: String,
    val name : String,
    var levelAccess: LevelAccess,
    val likedPostId: ArrayList<String> = ArrayList(),
    val followedUserId: ArrayList<String> = ArrayList(),
    val publishedPostId: ArrayList<String> = ArrayList()
)