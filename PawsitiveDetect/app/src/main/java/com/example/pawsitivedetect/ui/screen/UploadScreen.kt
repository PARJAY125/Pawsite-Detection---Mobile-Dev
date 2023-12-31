package com.example.pawsitivedetect.ui.screen

import android.content.res.Configuration
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.pawsitivedetect.R
import com.example.pawsitivedetect.ui.component.UploadImageHint
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun UploadScreen(
    onPublishButtonClick : () -> Unit
) {
    var selectedImageUri by remember {
        mutableStateOf<Uri?>(null)
    }
    val singlePhotoPickerLauncher = rememberLauncherForActivityResult (
        contract = ActivityResultContracts.PickVisualMedia(),
        onResult = { uri -> selectedImageUri = uri }
    )

    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    val claimOptions = listOf("AI Generated", "Human Art")
    val selectedOption by remember { mutableStateOf(claimOptions[0]) }

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item {
            Box (
                Modifier
                    .clickable {
                        singlePhotoPickerLauncher.launch(
                            PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                        )
                    },
                contentAlignment = Alignment.Center
            ){
                // TODO : IF (null -> display the helper) IF not display AsyncImage
                if (selectedImageUri == null) UploadImageHint()
                else
                    AsyncImage(
                        model = selectedImageUri,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(4.dp),
                        contentScale = ContentScale.Fit
                    )
            }

            OutlinedTextField(
                value = title,
                onValueChange = {title = it},
                label = {
                    Text(text = "Title")
                },
                isError = title.isNotEmpty(),
                supportingText = {
                    Text(text = "*required")
                },
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                value = description,
                onValueChange = {description = it},
                label = {
                    Text(text = "Description")
                },
                maxLines = 3,
                isError = description.isNotEmpty(),
                supportingText = {
                    Text(text = "*required")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
            )

            // TODO : CLAIM PROOF

            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                claimOptions.forEach { option ->
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        RadioButton(selected = selectedOption == option, onClick = { selectedOption == option })
                        Text(text = option)
                    }
                }
            }

            Button(onClick = {
                onPublishButtonClick()
            }) {
                Text(stringResource(id = R.string.publish))
            }
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun UploadScreenPreview() {
    PawsitiveDetectTheme {
        Surface {
            UploadScreen(
                {}
            )
        }
    }
}