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
import com.example.pawsitivedetect.GlobalVariable
import com.example.pawsitivedetect.model.Author
import com.example.pawsitivedetect.model.Message
import com.example.pawsitivedetect.ui.component.ChatBubble
import com.example.pawsitivedetect.ui.component.ChatMakerBox
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun ChatScreen(messages: List<Message>) {
    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            // Conversation Container
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
            ) {
                items(messages) { message ->
                    ChatBubble(message = message)
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
            ChatScreen(messages = GlobalVariable.sampleMessages)
        }
    }
}