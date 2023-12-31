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

@Composable
fun ChatScreen(
    personalChat: PersonalChat,
    interlocutors: User,
) {
    // TODO : This code should be not here but in the NavigationScreen
    // val interlocutors = getUserById(personalChat.interlocutorsId)

    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            // TODO : TOP_CHAT_SCREEN
            // ROW
                // IMAGE
                // NAME

            // Conversation Container
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
            ) {
                items(personalChat.chatList) { message ->
                    ChatBubble(chat = message)
                    Spacer(modifier = Modifier.padding(bottom = 8.dp))
                }
            }
        }
        ChatMakerBox(
            Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ChatScreenPreview() {
    PawsitiveDetectTheme {
        Surface {
            ChatScreen(DummyGlobalVariable.PERSONAL_CHAT_DUMMY, DummyGlobalVariable.USER_NARCISSISTIC_DUMMY)
        }
    }
}