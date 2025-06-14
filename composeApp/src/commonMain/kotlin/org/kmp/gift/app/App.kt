package org.kmp.gift.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.kmp.gift.app.navigation.LoginScreen
import org.kmp.gift.app.navigation.screens.LoginScreen

@Composable
fun App() {
    GiftAppTheme {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = LoginScreen
        ) {
            composable<LoginScreen> {
                LoginScreen()
            }
        }
    }
}