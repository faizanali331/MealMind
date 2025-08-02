package com.example.mealmind.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class HomeDestination (val route: String){
    @Serializable
    object HomeScreen: HomeDestination("home_screen")
    @Serializable
    object FoodDetails: HomeDestination("details/{id}"){
        fun createRoute(id: Int)="details/$id"
    }


}
