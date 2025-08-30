package com.example.mealmind.api

import com.example.mealmind.model.FoodItemList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface MealApiService {
    @GET("search.php")
    suspend fun getMeals(
        @Query("s") query: String
    ): Response <FoodItemList>
}
