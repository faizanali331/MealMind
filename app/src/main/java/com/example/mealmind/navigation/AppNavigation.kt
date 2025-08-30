package com.example.mealmind.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mealmind.HomeScreen
import com.example.mealmind.MealDetails

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = HomeDestination.HomeScreen.route){
        composable(
            HomeDestination.HomeScreen.route
        ) {
            HomeScreen(onClick = {id ->
                navController.navigate(HomeDestination.FoodDetails.createRoute(id))
            })
        }
        composable(
            route = HomeDestination.FoodDetails.route,
            arguments = listOf(navArgument("id"){
                type = NavType.StringType
            })
        ){ backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?:""
            //MealDetails(mealId = id)
        }
    }
}