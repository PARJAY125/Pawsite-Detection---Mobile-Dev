package com.example.pawsitivedetect.ui.navigation

sealed class Screen(val route: String) {
    // displayed "Home" but techically "ArtListScreen"

    object Login : Screen("Login")
    object Register : Screen("Register")

    object Home : Screen("Home")
    object Favorited : Screen("Favorited")
    object Explore : Screen("Explore")
    object Community : Screen("Community")
    object PrivateChat : Screen("PrivateChat")
    object Upload : Screen("Upload")
    object Notification : Screen("Notification")
    object Profile : Screen("Profile")

    object ArtDetail : Screen("Detail")
    object Commission : Screen("Commission")
}