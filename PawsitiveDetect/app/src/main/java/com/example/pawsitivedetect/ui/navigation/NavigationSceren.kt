package com.example.pawsitivedetect.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pawsitivedetect.ui.screen.ArtDetailScreen
import com.example.pawsitivedetect.ui.screen.ExploreScreen
import com.example.pawsitivedetect.ui.screen.HomeScreen
import com.example.pawsitivedetect.ui.screen.NotificationScreen
import com.example.pawsitivedetect.ui.screen.ProfileScreen
import com.example.pawsitivedetect.ui.screen.UploadScreen

@Composable
fun NavigationSceren(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen()
        }

        composable(route = Screen.Explore.route) {
            ExploreScreen()
        }

        composable(route = Screen.Upload.route) {
            UploadScreen()
        }

        composable(route = Screen.Notification.route) {
            NotificationScreen()
        }

        composable(route = Screen.Profile.route) {
            ProfileScreen()
        }

        composable(route = Screen.ArtDetail.route) {
            ArtDetailScreen()
        }
    }
}