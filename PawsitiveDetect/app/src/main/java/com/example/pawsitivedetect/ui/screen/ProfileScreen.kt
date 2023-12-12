package com.example.pawsitivedetect.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.pawsitivedetect.model.ArtPostPreview
import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.ui.component.ArtList
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme


@Composable
fun ProfileScreen(
    user: User,
    artPostPreview: List<ArtPostPreview>,
    navigateToArtDetailScreen: (String) -> Unit,
) {
    // TODO :
    //  - Column
    //      - Row
    //          - AsyncImage
    //          - Column
    //              - Name
    //              - Post Count
    //              - Following
    //              - Follower
    //          - ArtList(My Post List Id)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Row for User Information
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            // AsyncImage for User Avatar
            AsyncImage(
                model = user.profilePictureUrl,
                contentDescription = "User Avatar",
                modifier = Modifier
                    .size(80.dp)
                    .clip(shape = CircleShape)
            )

            // Column for User Details
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            ) {
                // Name
                Text(text = user.name, fontWeight = FontWeight.Bold, fontSize = 20.sp)

                // Post Count
                Text(text = "Posts: ${artPostPreview.size}")

                // Following Count
                Text(text = "Following: ${user.followingUserId.size}")

                // Follower Count
                Text(text = "Followers: ${user.followerUserId.size}")
            }
        }

        // ArtList (My Post List Id)
        ArtList(
            artPostPreview,
            navigateToArtDetailScreen = {
                navigateToArtDetailScreen(it)
            }
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ProfileScreenPreview() {
    PawsitiveDetectTheme {
        Surface {
            // TODO : anu
            // ProfileScreen()
        }
    }
}