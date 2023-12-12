package com.example.pawsitivedetect.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.pawsitivedetect.model.ArtPostDetail
import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.model.getUserById
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.ui.component.CommentMessage
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun ArtDetailScreen(
    artPostDetail: ArtPostDetail,
    getUserByCommentatorId: (String) -> User,   // TODO (EXPERIMENTAL) : Check if this work
    onFollowClick: () -> Unit,
    onFavoriteClick: () -> Unit
) {
    val rArtPostDetail by remember(artPostDetail) {
        mutableStateOf(artPostDetail)
    }

    val commentators : ArrayList<User> = arrayListOf()

    // TODO : callback function get data concept
    artPostDetail.comments.forEach {
        commentators.add(getUserByCommentatorId(it.senderId))
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            // .verticalScroll(rememberScrollState()) // TODO : error when applied
    ) {

        // Art Image
        AsyncImage(
            model = artPostDetail.imageUrl,
            contentDescription = "Art Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(0.dp, 400.dp)
                .background(Color.Gray)
        )

        // Text Judul
        Text(
            text = rArtPostDetail.title,
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(top = 8.dp)
        )

        // Text Deskripsi
        Text(
            text = rArtPostDetail.description,
            style = TextStyle(fontSize = 16.sp),
            modifier = Modifier
                .padding(top = 8.dp)
        )

        // Button Follow
        Button(
            onClick = { onFollowClick() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text(text = "Follow")
        }

        // Button Favorite
        Button(
            onClick = { onFavoriteClick() },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            Text(text = "Favorite")
        }

        // TODO : Nested Comment
        LazyColumn {
            items(rArtPostDetail.comments) { comments ->
                val commenter = commentators.find { user -> user.id == comments.senderId }
                CommentMessage(comment = comments, user = commenter!! )
            }
        }

    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ArtDetailScreenPreview() {
    PawsitiveDetectTheme {
        Surface {
            ArtDetailScreen(
                DummyGlobalVariable.ART_POST_DETAIL_DUMMY,
                getUserByCommentatorId = {
                    getUserById(it)
                },
                onFollowClick = {},
                onFavoriteClick = {},
            )
        }
    }
}