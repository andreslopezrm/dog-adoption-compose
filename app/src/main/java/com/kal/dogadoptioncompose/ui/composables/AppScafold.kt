package com.kal.dogadoptioncompose.ui.composables


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController

@Composable
fun AppScaffold() {

    val navController = rememberNavController()

    NavHost(navController, startDestination = "list") {
        composable("list") { DogList(navController) }
        composable("profile/{id}", arguments = listOf(
            navArgument("{id}") {
                type = NavType.IntType
            }
        )) { backStackEntry ->
            DogProfile(navController, backStackEntry.arguments?.getString("id"))
        }
    }
}

