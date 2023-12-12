package com.example.pawsitivedetect.model

data class User(
    val id: String,
    val name : String,
    val profilePictureUrl : String,
    var levelAccess: LevelAccess,
    val likedPostId: ArrayList<String> = ArrayList(),
    val followerUserId: ArrayList<String> = ArrayList(),
    val followingUserId: ArrayList<String> = ArrayList(),
    val publishedPostId: ArrayList<String> = ArrayList()
)