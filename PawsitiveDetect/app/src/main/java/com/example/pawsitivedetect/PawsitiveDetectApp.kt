package com.example.pawsitivedetect

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.pawsitivedetect.ui.component.BottomBar
import com.example.pawsitivedetect.ui.navigation.NavigationSceren
import com.example.pawsitivedetect.ui.navigation.Screen
import com.example.pawsitivedetect.ui.theme.PawsitiveDetectTheme

@Composable
fun PawsitiveDetectApp(
    navController: NavHostController = rememberNavController(),
) {
    val navBackStackEntry by rememberNavController().currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            // TODO : if screen home, favorited, profile, notif, explore display BotNav
            if (currentRoute != Screen.Upload.route) BottomBar(navController)
        }
    ) { innerPadding ->
        NavigationSceren(navController, modifier = Modifier.padding(innerPadding))
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun PawsitiveDetectAppPreview() {
    PawsitiveDetectTheme {
        PawsitiveDetectApp(navController = rememberNavController())
    }
}