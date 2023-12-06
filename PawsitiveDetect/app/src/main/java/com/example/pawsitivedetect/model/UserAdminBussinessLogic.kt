package com.example.pawsitivedetect.model

fun User.updateUserLevelAccess(targetUser: User, grantLevelAccess: LevelAccess) {
    if (levelAccess != LevelAccess.Admin) return
    targetUser.levelAccess = grantLevelAccess

    // TODO : API CALL - UPDATE_USER
}