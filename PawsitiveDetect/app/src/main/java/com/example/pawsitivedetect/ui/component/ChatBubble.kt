package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.model.Chat
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

// TODO : replace GlobalVariable.myId with cleaner code
@Composable
fun ChatBubble(
    chat: Chat,
    modifier: Modifier = Modifier,
) {
    val isFromMe by remember {
        mutableStateOf(chat.isFromMe)
    }
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = if (isFromMe) Arrangement.End else Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 48f,
                        topEnd = 48f,
                        bottomStart = if (isFromMe) 48f else 0f,
                        bottomEnd = if (isFromMe) 0f else 48f
                    )
                )
                // TODO : decide background color later
                .background(if (isFromMe) Color.Magenta else Color.Gray)
                .padding(16.dp),
        ) {
            Text(text = chat.text)
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                text = chat.time,
                fontSize = 12.sp,
                color = Color.DarkGray
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ChatBubblePreview() {
    PawsitiveDetectTheme {
        Surface {
            Column {
                val message1 = DummyGlobalVariable.SIMPLE_CHAT_DUMMY[0]
                ChatBubble(message1, Modifier.padding(16.dp))

                val message2 = DummyGlobalVariable.SIMPLE_CHAT_DUMMY[1]
                ChatBubble(message2, Modifier.padding(16.dp))
            }
        }
    }
}