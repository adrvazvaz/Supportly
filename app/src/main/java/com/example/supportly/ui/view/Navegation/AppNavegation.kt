package com.example.supportly.ui.view.Navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.supportly.ui.view.Login
import com.example.supportly.ui.view.MainPage

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "mainpage") {
        composable("mainPage") {
            MainPage(
                onNavigateToLogin = { navController.navigate("login") }
            )
        }
        composable("login") {
            Login()
        }
        composable("register") {
            Login()
        }
    }
}
