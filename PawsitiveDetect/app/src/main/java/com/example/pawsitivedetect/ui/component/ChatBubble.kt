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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pawsitivedetect.GlobalVariable
import com.example.pawsitivedetect.model.Message
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

// TODO : replace GlobalVariable.myId with cleaner code
@Composable
fun ChatBubble(
    message: Message,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = if (message.sender.id == GlobalVariable.myId) Arrangement.End else Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 48f,
                        topEnd = 48f,
                        bottomStart = if (message.sender.id == GlobalVariable.myId) 48f else 0f,
                        bottomEnd = if (message.sender.id == GlobalVariable.myId) 0f else 48f
                    )
                )
                // TODO : decide background color later
                .background(if (message.sender.id == GlobalVariable.myId) Color.Magenta else Color.Gray)
                .padding(16.dp),
        ) {
            Text(text = message.text)
            Spacer(modifier = Modifier.padding(8.dp))
            Text(
                text = message.time,
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
                val message1 = GlobalVariable.sampleMessages[0]
                ChatBubble(message1, Modifier.padding(16.dp))

                val message2 = GlobalVariable.sampleMessages[1]
                ChatBubble(message2, Modifier.padding(16.dp))
            }
        }
    }
}