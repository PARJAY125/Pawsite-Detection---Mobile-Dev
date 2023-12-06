package com.example.pawsitivedetect.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pawsitivedetect.R
import com.example.pawsitivedetect.model.ArtPostDetail
import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.model.getUserById
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

//@Composable
//fun ArtDetailScreen(
//    artPostDetail: ArtPostDetail,
//    onFollowClick: () -> Unit, // Callback for Follow button click
//    onFavoriteClick: () -> Unit // Callback for Favorite button click
//) {
//    // TODO : API CALL load USER FROM
//
//    val commentators : ArrayList<User> = arrayListOf()
//
//    artPostDetail.comments?.forEach {
//        commentators.add(getUserById(it.senderId))
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        // Art Image
//        Image(
//            painter = painterResource(id = R.drawable.your_art_image),
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(200.dp)
//                .clip(shape = RoundedCornerShape(8.dp)),
//            contentScale = ContentScale.Crop
//        )
//
//        // Text Judul
//        Text(
//            text = artPostDetail.judul,
//            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
//            modifier = Modifier
//                .padding(top = 8.dp)
//        )
//
//        // Text Deskripsi
//        Text(
//            text = artPostDetail.deskripsi,
//            style = TextStyle(fontSize = 16.sp),
//            modifier = Modifier
//                .padding(top = 8.dp)
//        )
//
//        // Button Follow
//        Button(
//            onClick = { onFollowClick() },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp)
//        ) {
//            Text(text = "Follow")
//        }
//
//        // Button Favorite
//        Button(
//            onClick = { onFavoriteClick() },
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 8.dp)
//        ) {
//            Text(text = "Favorite")
//        }
//
//        // Comment Section
//        CommentSection(comments = artPostDetail.comments)
//    }
//
//    // Column
//        // art image
//        // text judul
//        // text deskripsi
//        // Button Follow
//        // Button Favorite
//
//        // Comment Section
//            // LazyColumn
//                // items -> CommentMessage(artPostDetail.message)
//}
//
//@Preview(showBackground = true)
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
//@Composable
//fun ArtDetailScreenPreview() {
//    PawsitiveDetectTheme {
//        Surface {
//            ArtDetailScreen(
//                ,
//                {},
//                {}
//            )
//        }
//    }
//}