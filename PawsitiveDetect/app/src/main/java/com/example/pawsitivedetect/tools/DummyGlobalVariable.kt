package com.example.pawsitivedetect.tools

import com.example.pawsitivedetect.model.ArtPostDetail
import com.example.pawsitivedetect.model.ArtPostPreview
import com.example.pawsitivedetect.model.LevelAccess
import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.model.Chat
import com.example.pawsitivedetect.model.ChildComment
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
        val STANDAR_3_ID_DUMMY = "IdUserStandar3"
        val VALIDATOR_ID_DUMMY = "IdUserValidator1"

        // TODO : tambahin profilePictureUrl
        val USER_ADMIN_DUMMY = User(ADMIN_ID_DUMMY, "Parjay the System God", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png", LevelAccess.Admin)
        val USER_VALIDATOR = User(VALIDATOR_ID_DUMMY, "The Validator", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png", LevelAccess.Validator)
        val USER_TESTING_DUMMY = User(STANDAR_3_ID_DUMMY, "User Testing", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png", LevelAccess.Standar)
        val USER_NARCISSISTIC_DUMMY = User(STANDAR_2_ID_DUMMY, "Narcissistic User", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png", LevelAccess.Standar)
        val USER_FAMOUS_ARTIST_DUMMY = User(STANDAR_1_ID_DUMMY, "Famous Artis", "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png", LevelAccess.Standar)

        val SIMPLE_CHAT_DUMMY = listOf(
            Chat("Hello!", "12:30 PM", isUnread = true, isFromMe = true),
            Chat("Hi there!", "12:31 PM", isUnread = true, isFromMe = false),
            Chat("How are you?", "12:32 PM", isUnread = true, isFromMe = true),
            Chat("I'm good, thank you!", "12:33 PM", isUnread = false, isFromMe = false),
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

        val CHILD_COMMENT_1_DUMMY = ChildComment(
            id = "1",
            parentId = "1",
            senderId = "user3",
            commentPosition = 1,
            time = "2023-12-06T16:49:20Z",
            text = "This is a child comment.",
            likedBy = 5
        )

        val CHILD_COMMENT_2_DUMMY = ChildComment(
            id = "2",
            parentId = "2",
            senderId = "user4",
            commentPosition = 1,
            time = "2023-12-06T16:49:30Z",
            text = "This is another child comment.",
            likedBy = 15
        )

        val PARENT_COMMENT_1_DUMMY = ParentComment(
            id = "1",
            senderId = USER_NARCISSISTIC_DUMMY.id,
            commentPosition = 1,
            time = "2023-12-06T16:49:00Z",
            text = "This is a parent comment.",
            likedBy = 10,
            childComment = arrayListOf(
                CHILD_COMMENT_1_DUMMY,
                CHILD_COMMENT_2_DUMMY
            )
        )

        val PARENT_COMMENT_2_DUMMY = ParentComment(
            id = "2",
            senderId = "user2",
            commentPosition = 2,
            time = "2023-12-06T16:49:10Z",
            text = "This is another parent comment.",
            likedBy = 20,
            childComment = arrayListOf()
        )

        val ART_1_ID_DUMMY = "Art1Id"
        val ART_IMG_URL_DUMMY = "use 1 link from pinterest later"

        val ART_POST_DETAIL_DUMMY = ArtPostDetail(
            ART_1_ID_DUMMY,
            USER_FAMOUS_ARTIST_DUMMY.id,
            true,
            ART_IMG_URL_DUMMY,
            "Great Art",
            "Very Great Description from The Great and Famous Artist",
            false,
            100,
            arrayListOf(
                PARENT_COMMENT_1_DUMMY
            )
        )

        val ART_POST_PERVIEW_DUMMY = arrayListOf(
            ArtPostPreview("ArtPostId_1", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQW7RVxhtazeQCZ0-YlMPknh2z5vCtVI_M_WA_vVDY&s"),
            ArtPostPreview("ArtPostId_2", "https://i.pinimg.com/564x/aa/a9/42/aaa9428e3fc7f85a9472ce4fcde6673d.jpg"),
            ArtPostPreview("ArtPostId_3", "https://wallpapercave.com/wp/wp4586763.jpg"),
            ArtPostPreview("ArtPostId_4", "https://wallpapers.com/images/high/one-piece-volume-100-cover-k7bevvbacy3ueq5r.webp"),
            ArtPostPreview("ArtPostId_5", "https://animesorionvip.com/wsx/an/fullmetal-alchemist-brotherhood-todos-os-episodios-animes-orion.jpg"),
            ArtPostPreview("ArtPostId_6", "https://wallpapers.com/images/hd/my-hero-academia-logo-game-cover-0g0twdvydbvww568.jpg"),
            ArtPostPreview("ArtPostId_7", "https://wallpapers.com/images/hd/kimetsu-no-yaiba-pictures-0m5miqf0v6ryo93u.jpg"),
            ArtPostPreview("ArtPostId_8", "https://i.pinimg.com/originals/2c/2e/f8/2c2ef858f30b405d6d25df4d30babe25.jpg"),
            ArtPostPreview("ArtPostId_9", "https://m.media-amazon.com/images/M/MV5BNGM0YTk3MWEtN2JlZC00ZmZmLWIwMDktZTMxZGE5Zjc2MGExXkEyXkFqcGdeQXVyNjAwNDUxODI@._V1_FMjpg_UX1000_.jpg"),
            ArtPostPreview("ArtPostId_0", "https://i.pinimg.com/originals/4b/2f/e5/4b2fe5bd23af3954a9e3e6dbb587366f.png")
        )
    }
}