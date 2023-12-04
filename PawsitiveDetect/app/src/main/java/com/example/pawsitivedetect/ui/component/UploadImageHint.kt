package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun UploadImageHint() {
    Column(
        modifier = Modifier
            .size(300.dp)
            .fillMaxWidth()
            .border( width = 2.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(16.dp)
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Icon (upload)
        Icon(
            imageVector = Icons.Default.KeyboardArrowUp,
            contentDescription = "Upload",
            tint = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .size(48.dp)
                .padding(bottom = 8.dp)
        )

        // Text ("click here to upload image")
        Text(
            text = "Click here to upload image",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.bodyMedium,
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun UploadImageHintPreview() {
    PawsitiveDetectTheme {
        Surface {
            UploadImageHint()
        }
    }
}