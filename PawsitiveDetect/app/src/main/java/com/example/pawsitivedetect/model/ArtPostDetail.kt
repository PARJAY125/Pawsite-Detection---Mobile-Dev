package com.example.pawsitivedetect.model

data class ArtPostDetail(
    val artPostId : String,
    val publisherId : String,
    var isVerified : Boolean,

    val imageUrl: String,
    val title: String,
    val description: String,
    val isAiGenerated : Boolean,

    val likedBy : Int,
    val comments: List<ParentComment> = arrayListOf()
)