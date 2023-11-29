package com.example.pawsitivedetect.ui.navigation

sealed class Screen(val route: String) {
    // displayed "Home" but techically "ArtListScreen"
    object Home : Screen("Home")
    object Favorited : Screen("Favorited")
    object Explore : Screen("Explore")
    object Community : Screen("Explore")
    object Upload : Screen("Upload")
    object Notification : Screen("Notification")
    object Profile : Screen("Profile")

    object ArtDetail : Screen("Detail")
}