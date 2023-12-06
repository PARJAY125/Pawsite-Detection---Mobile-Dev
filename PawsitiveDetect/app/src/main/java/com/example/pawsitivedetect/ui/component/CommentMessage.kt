package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.R

import com.example.pawsitivedetect.model.User
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

// TODO : replace GlobalVariable.myId with cleaner code
//@Composable
//fun CommentMessage(
//    comment: Comment,
//    user: User,
//    modifier: Modifier = Modifier,
//) {
//    // save the variable by remember mutable state
//    val commentValue by remember {
//        mutableStateOf(comment)
//    }
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//    ) {
//        // profile picture
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = null, // decorative
//            modifier = Modifier
//                .size(40.dp)
//                .clip(CircleShape)
//                .background(MaterialTheme.colorScheme.primary)
//        )
//
//        Spacer(modifier = Modifier.width(8.dp))
//
//        // Column
//        Column {
//            Text(
//                // TODO :
//                text = commentValue.senderId,
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier.padding(bottom = 4.dp)
//            )
//
//            Text(
//                text = commentValue.text,
//                style = MaterialTheme.typography.bodyMedium,
//                modifier = Modifier.padding(bottom = 8.dp)
//            )
//
//            // Row with days, like icon, and report icon
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween
//            ) {
//                // Text days
//                Text(
//                    text = commentValue.time,
//                    style = MaterialTheme.typography.labelSmall,
//                    modifier = Modifier.weight(1f)
//                )
//
//                Spacer(modifier = Modifier.width(16.dp))
//
//                // Icon Like
//                Icon(
//                    imageVector = Icons.Default.Favorite,
//                    contentDescription = "Favorite this Art Icon",
//                    tint = MaterialTheme.colorScheme.primary,
//                    modifier = Modifier.size(24.dp)
//                )
//
//                Spacer(modifier = Modifier.width(8.dp))
//
//                // Icon Report
//                Icon(
//                    imageVector = Icons.Outlined.Warning,
//                    contentDescription = "Report User Icon",
//                    tint = MaterialTheme.colorScheme.error,
//                    modifier = Modifier.size(24.dp)
//                )
//            }
//        }
//    }
//}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun CommentMessagePreview() {
    PawsitiveDetectTheme {
        Surface {
            Column {
//                val message1 = DummyGlobalVariable.SIMPLE_COMMENT_DUMMY
//                CommentMessage(message1, DummyGlobalVariable.USER_NARCISSISTIC_DUMMY, Modifier.padding(16.dp))
            }
        }
    }
}