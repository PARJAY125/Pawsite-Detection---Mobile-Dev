package com.example.pawsitivedetect.model

import com.example.pawsitivedetect.tools.DummyGlobalVariable

fun User.proposeArt(isAiGenerated : Boolean, title : String, description : String) {
    val artPostDetail = ArtPostDetail(
        DummyGlobalVariable.ART_POST_ID_DUMMY,
        id,
        isAiGenerated,
        DummyGlobalVariable.IMAGE_URL_DUMMY,
        title,
        description,
        false,
        0
    )

    // TODO : API CALL - PUBLISH_ART
}

fun User.updateLikedPost(postId : String) {

    if (!likedPostId.contains(postId)) likedPostId.add(postId)
    else likedPostId.remove(postId)

    // TODO : API CALL - USER_UPDATE
}