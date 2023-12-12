package com.example.pawsitivedetect

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute !in listOf(
                    Screen.Upload.route,
                    Screen.Login.route,
                    Screen.Register.route
                ))
                BottomBar(navController)
        },
        topBar = {
            // TODO : Look like there will be more task for me
        },
    ) { innerPadding ->
        Column {
            Text(text = currentRoute.toString())
            NavigationSceren(navController, modifier = Modifier.padding(innerPadding))
        }
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun PawsitiveDetectAppPreview() {
    PawsitiveDetectTheme {
        PawsitiveDetectApp(
            navController = rememberNavController()
        )
    }
}