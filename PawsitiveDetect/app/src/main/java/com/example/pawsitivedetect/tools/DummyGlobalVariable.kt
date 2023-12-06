package com.example.pawsitivedetect.tools

import com.example.pawsitivedetect.model.ArtPostDetail
import com.example.pawsitivedetect.model.LevelAccess
import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.model.Chat
import com.example.pawsitivedetect.model.ParentComment
import com.example.pawsitivedetect.model.PersonalChat

// TODO : REPLACE LATER
class DummyGlobalVariable {
    companion object {
        val MY_ID_DUMMY = "UserAdmin1"

        val ART_POST_ID_DUMMY = "Auto Generate"
        val IMAGE_URL_DUMMY = "https:get%20from%20pinterest%20later.com"

        val ADMIN_ID_DUMMY = "IdUserAdmin1"
        val STANDAR_1_ID_DUMMY = "IdUserStandar1"
        val STANDAR_2_ID_DUMMY = "IdUserStandar2"
        val VALIDATOR_ID_DUMMY = "IdUserValidator1"

        val USER_ADMIN_DUMMY = User(ADMIN_ID_DUMMY, "Parjay the System God", LevelAccess.Admin)
        val USER_VALIDATOR = User(VALIDATOR_ID_DUMMY, "The Validator", LevelAccess.Validator)
        val USER_NARCISSISTIC_DUMMY = User(STANDAR_2_ID_DUMMY, "Narcissistic User", LevelAccess.Standar)
        val USER_FAMOUS_ARTIST_DUMMY = User(STANDAR_1_ID_DUMMY, "Famous Artis", LevelAccess.Standar)

        val SIMPLE_CHAT_DUMMY = listOf(
            Chat("Hello!", "12:30 PM", true),
            Chat("Hi there!", "12:31 PM", false),
            Chat("How are you?", "12:32 PM", true),
            Chat("I'm good, thank you!", "12:33 PM", false),
        )

        val PERSONAL_CHAT_DUMMY = PersonalChat(
            "PC DUMMY",
            USER_NARCISSISTIC_DUMMY.id,
            SIMPLE_CHAT_DUMMY
        )

        val USER_LIST_DUMMY = listOf(
            USER_ADMIN_DUMMY,
            USER_VALIDATOR,
            USER_FAMOUS_ARTIST_DUMMY,
            USER_NARCISSISTIC_DUMMY,
            USER_FAMOUS_ARTIST_DUMMY
        )

//        val SIMPLE_COMMENT_DUMMY = ParentComment(
//            "Sepuuuh ajarin dong sepuuuh",
//            "12:12",
//            0,
//            1.0f,
//            USER_NARCISSISTIC_DUMMY.id
//        )
//
//        val LIST_COMMENT_DUMMY = listOf(
//            ParentComment
//        )

        val ART_1_ID_DUMMY = "Art1Id"
        val ART_IMG_URL_DUMMY = "use 1 link from pinterest later"

//        val ART_POST_DETAIL_DUMMY = ArtPostDetail(
//            ART_1_ID_DUMMY,
//            USER_FAMOUS_ARTIST_DUMMY.id,
//            true,
//            ART_IMG_URL_DUMMY,
//            "Great Art",
//            "Very Great Description from The Great and Famous Artist",
//            false,
//            100,
//            SIMPLE_COMMENT_DUMMY
//        )
    }
}