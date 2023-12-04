package com.example.pawsitivedetect.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun CommisionScreen() {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = title,
            onValueChange = {title = it},
            label = {
                Text(text = "Commission Title")
            },
            modifier = Modifier
                .fillMaxWidth()
        )

        OutlinedTextField(
            value = description,
            onValueChange = {description = it},
            label = {
                Text(text = "Description")
            },
            maxLines = 3,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        )

        // TODO : input multiple image - reference
        // TODO : display multiple image
        // TODO : BID / Pasang Harga?

        Button(onClick = { /*TODO : API Upload Commision Data to Server*/ }) {
            Text("Request Commision")
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun CommissionScreenPreview() {
    PawsitiveDetectTheme {
        Surface {
            CommisionScreen()
        }
    }
}