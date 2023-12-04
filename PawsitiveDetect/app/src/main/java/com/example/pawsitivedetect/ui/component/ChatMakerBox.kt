package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun ChatMakerBox (modifier: Modifier = Modifier) {
    var message by remember { mutableStateOf("") }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        // OutlinedTextField
        OutlinedTextField(
            value = message,
            onValueChange = { message = it },
            label = { },
            modifier = Modifier
                .weight(1f)
        )

        Spacer(modifier = Modifier.padding(8.dp))

        // Button with Send Icon
        IconButton(
            onClick = {
                if (message.isNotBlank()) {
                    // TODO : API Call
                }
            },
            modifier = Modifier.background(MaterialTheme.colorScheme.primary)
        ) {
            Icon(
                imageVector = Icons.Outlined.Send,
                contentDescription = "send message",
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ChatMakerBoxPreview() {
    PawsitiveDetectTheme {
        Surface {
            ChatMakerBox()
        }
    }
}