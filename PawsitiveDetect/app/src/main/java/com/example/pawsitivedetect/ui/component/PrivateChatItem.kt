package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawsitivedetect.R
import com.example.pawsitivedetect.model.PersonalChat
import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun PrivateChatItem(
    user: User,
    personalChat: PersonalChat,
    onPrivateChatItemClick: () -> Unit
) {

    val rPersonalChat by remember(personalChat) {
        mutableStateOf(personalChat)
    }

    var notificationCount by remember {
        mutableIntStateOf(0)
    }
    rPersonalChat.chatList.forEach {
        if (it.isUnread) notificationCount++
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {

            }
    ) {
        // profile picture
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary)
        )

        Spacer(modifier = Modifier.width(8.dp))

        // Column
        Column {
            Text(
                // TODO :
                text = user.name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = personalChat.chatList[0].text,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        // Spacer
        Spacer(modifier = Modifier.width(16.dp))

        // Unread count
        Text(
            text = if (notificationCount > 0) notificationCount.toString() else "",
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primary)
                .clip(CircleShape)
                .padding(4.dp)
        )
    }

}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun PrivateChatItemPreview() {
    PawsitiveDetectTheme {
        Surface {
            Column {

                // TODO : write one PersonalChat in DummyGlobalVariable Class
//                PrivateChatItem(
//                    DummyGlobalVariable.USER_NARCISSISTIC_DUMMY,
//                    onPrivateChatItemClick = {},
//                    personalChat =
//                )
            }
        }
    }
}