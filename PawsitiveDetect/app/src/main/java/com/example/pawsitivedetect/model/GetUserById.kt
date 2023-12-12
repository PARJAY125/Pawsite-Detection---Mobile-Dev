package com.example.pawsitivedetect.model

import com.example.pawsitivedetect.tools.DummyGlobalVariable

fun getUserById(userId : String) : User {
    // TODO : API CALL GET-USER
    var targetedUser : User = DummyGlobalVariable.USER_TESTING_DUMMY

    DummyGlobalVariable.USER_LIST_DUMMY.forEach {
        if (it.id == userId) targetedUser = it
    }

    // TODO : Still dummy return
    return targetedUser
}