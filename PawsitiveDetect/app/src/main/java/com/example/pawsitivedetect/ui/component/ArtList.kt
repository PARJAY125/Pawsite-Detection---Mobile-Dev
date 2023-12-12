package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.pawsitivedetect.R
import com.example.pawsitivedetect.model.ArtPostPreview
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun ArtList(
    artPostPreviewList: List<ArtPostPreview>,
    navigateToArtDetailScreen: (String) -> Unit
) {
    LazyVerticalStaggeredGrid (
        columns = StaggeredGridCells.Fixed ( 2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues (16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalItemSpacing = 8.dp
    ) {
        items(artPostPreviewList) { artPostPreview ->
            AsyncImage(
                model = artPostPreview.imageUrl,
                contentDescription = "anime Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Gray)
                    .clickable {
                        navigateToArtDetailScreen(artPostPreview.artPostId)
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ArtListPreview() {
    PawsitiveDetectTheme {
        Surface {
            ArtList(
                DummyGlobalVariable.ART_POST_PERVIEW_DUMMY,
                {}
            )
        }
    }
}