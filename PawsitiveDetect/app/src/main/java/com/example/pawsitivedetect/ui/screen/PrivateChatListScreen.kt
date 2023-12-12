package com.example.pawsitivedetect.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawsitivedetect.model.getUserById
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.model.PersonalChat
import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.ui.component.ChatBubble
import com.example.pawsitivedetect.ui.component.ChatMakerBox
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

// TODO : Make this
@Composable
fun PrivateChatListScreen(
    pairedPersonalChatWithUser : ArrayList<Pair<PersonalChat, User>>
) {
    // Lazy Column (userList) -> user
        // New Component (user,)
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun PrivateChatListScreenPreview() {
    PawsitiveDetectTheme {
        Surface {
            // TODO : anu
//            PrivateChatListScreen()
        }
    }
}