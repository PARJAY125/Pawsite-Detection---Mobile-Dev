package com.example.pawsitivedetect.ui.component

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawsitivedetect.R
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun ArtList(images: List<Int>) {

    LazyVerticalStaggeredGrid (
        columns = StaggeredGridCells.Fixed ( 2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues (16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalItemSpacing = 8.dp
    ) {
        items(images) { item ->
            Image(
                painter = painterResource(id = item),
                contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Fit,
            )
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun ArtListPreview() {
    PawsitiveDetectTheme {
        val imageList = arrayListOf<Int>(
            R.drawable.landscape_1,
            R.drawable.portrait_1,
            R.drawable.portrait_2,
            R.drawable.landscape_2,
            R.drawable.portrait_3,
            R.drawable.portrait_4,
            R.drawable.portrait_5,
            R.drawable.portrait_6,
        )

        Surface {
            ArtList(imageList)
        }
    }
}