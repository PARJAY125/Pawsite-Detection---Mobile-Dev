package com.example.pawsitivedetect.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pawsitivedetect.R
import com.example.pawsitivedetect.model.ArtPostPreview
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.ui.component.ArtList
import com.example.pawsitivedetect.ui.navigation.Screen
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun HomeScreen(
    artPostPreviews: List<ArtPostPreview>,
    navigateToArtDetailScreen: (String) -> Unit,
    navigateToFavoriteScreen: () -> Unit,
) {
    Column {
        Button(onClick = { navigateToFavoriteScreen() }) {
            Text(text = "go to favorite")
        }

        ArtList(
            artPostPreviews,
            navigateToArtDetailScreen
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun HomeScreenPreview() {
    PawsitiveDetectTheme {
        Surface {
            HomeScreen(
                DummyGlobalVariable.ART_POST_PERVIEW_DUMMY,
                {},
                {}
            )
        }
    }
}