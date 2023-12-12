package com.example.pawsitivedetect.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pawsitivedetect.R
import com.example.pawsitivedetect.model.getUserById
import com.example.pawsitivedetect.tools.DummyGlobalVariable
import com.example.pawsitivedetect.tools.UtilityFunction
import com.example.pawsitivedetect.ui.screen.ArtDetailScreen
import com.example.pawsitivedetect.ui.screen.CommisionScreen
import com.example.pawsitivedetect.ui.screen.ExploreScreen
import com.example.pawsitivedetect.ui.screen.FavoritedScreen
import com.example.pawsitivedetect.ui.screen.HomeScreen
import com.example.pawsitivedetect.ui.screen.LoginScreen
import com.example.pawsitivedetect.ui.screen.NotificationScreen
import com.example.pawsitivedetect.ui.screen.PrivateChatListScreen
import com.example.pawsitivedetect.ui.screen.ProfileScreen
import com.example.pawsitivedetect.ui.screen.RegisterScreen
import com.example.pawsitivedetect.ui.screen.UploadScreen

@Composable
fun NavigationSceren(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    // TODO - Core :
    //  Register - DONE     (note : password rule? 8 char ++?, letter number mix?, etc )
    //  Login - DONE        (note : password rule? 8 char ++?, letter number mix?, etc )
    //  Dashboard (Profile) - DUMMY DATA
    //  Home - DUMMY DATA
    //  Form Check (Upload) - DUMMY DATA
    //  Publish Art

    // TODO :
    //  firebase storage read write - https://console.firebase.google.com/project/supradmin/storage/supradmin.appspot.com/files
    //  coba API nuklir - “tombol nuklir” : https://huggingface.co/umm-maybe/AI-image-detector
    //  isolated user (kayak akun instagram mode private) selengkapnya pastikan lagi di grup



    // Viewmodel provider

    // TODO : WTF is this!? very not clean code, replace later
    var loggedIn by remember {
        mutableStateOf(false)
    }

    NavHost(
        navController = navController,
        startDestination = if(loggedIn) Screen.Home.route else Screen.Register.route
    ) {
        composable(route = Screen.Register.route) {
            RegisterScreen(
                onRegisterButtonClick = {
                    // TODO : API - CALL
                    navController.navigate(Screen.Login.route)
                }
            )
        }

        composable(route = Screen.Login.route) {
            LoginScreen(
                onLoginButtonClick = {
                    // TODO : API - CALL
                    navController.navigate(Screen.Home.route)
                }
            )
        }

        // TODO : this is DUMMY
        composable(route = Screen.Home.route) {
            loggedIn = true
            HomeScreen(
                DummyGlobalVariable.ART_POST_PERVIEW_DUMMY,
                navigateToArtDetailScreen = {
                    // TODO onclick callback :
                    //  1. get ArtPostPreview.postId
                    //  2. get artPostDetail by ArtPostPreview.postId
                    //  3. go to ArtDetailScreen
                    navController.navigate(Screen.ArtDetail.route)
                },
                navigateToFavoriteScreen = { navController.navigate(Screen.Favorited.route) }
            )
        }

        // TODO : deploy
        composable(route = Screen.PrivateChat.route) {
//             PrivateChatListScreen()
        }

        composable(route = Screen.Favorited.route) {
            FavoritedScreen()
        }

        // IGNORE
        composable(route = Screen.Explore.route) {
            ExploreScreen()
        }

        composable(route = Screen.Upload.route) {
            UploadScreen(
                onPublishButtonClick = {
                    // TODO : Not Yet Implemented
                    //  API Upload Image to Server
                }
            )
        }

        // IGNORE
        composable(route = Screen.Notification.route) {
            NotificationScreen()
        }

        // TODO : This is Using DUMMY Data
        composable(route = Screen.Profile.route) {
            ProfileScreen(
                user = DummyGlobalVariable.USER_NARCISSISTIC_DUMMY,
                artPostPreview = DummyGlobalVariable.ART_POST_PERVIEW_DUMMY,
                navigateToArtDetailScreen = {
                    // TODO onclick callback :
                    //  1. get ArtPostPreview.postId
                    //  2. get artPostDetail by ArtPostPreview.postId
                    //  3. go to ArtDetailScreen
                    navController.navigate(Screen.ArtDetail.route)
                },
            )
        }

        // TODO : This is Using DUMMY Data
        composable(route = Screen.ArtDetail.route) {
            ArtDetailScreen(
                DummyGlobalVariable.ART_POST_DETAIL_DUMMY,
                getUserByCommentatorId = {
                    getUserById(it)
                },
                onFollowClick = {},
                onFavoriteClick = {},
            )
        }

        // TODO : This is Using DUMMY Data
        composable(route = Screen.Commission.route) {
            CommisionScreen(
                DummyGlobalVariable.USER_FAMOUS_ARTIST_DUMMY,
                onRequestCommisionButtonClick = {}
            )
        }
    }
}