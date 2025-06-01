package dev.donmanuel.ecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.donmanuel.ecommerce.presentation.screens.DetailsScreen
import dev.donmanuel.ecommerce.presentation.screens.HomeScreen
import dev.donmanuel.ecommerce.presentation.screens.LoginScreen
import dev.donmanuel.ecommerce.presentation.screens.SignUpScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route
    ) {

        composable(Screen.LoginScreen.route) {
            LoginScreen(navController)
        }

        composable(Screen.SignUpScreen.route) {
            SignUpScreen(navController)
        }

        composable(Screen.HomeScreen.route) {
            HomeScreen(navController)
        }

        composable(
            "${Screen.DetailsScreen.route}/{index}",
            arguments = listOf(navArgument("index") { type = NavType.IntType })
        ) {
            DetailsScreen(navController, it.arguments?.getInt("index") ?: 0)
        }

    }
}