package com.example.pawsitivedetect.model

fun User.validateProposeArt(artPostDetail: ArtPostDetail, verifierValidationResults : Boolean) {
    if (levelAccess == LevelAccess.Standar) return
    artPostDetail.isVerified = verifierValidationResults

    // TODO : API CALL - UPDATE_ART
}