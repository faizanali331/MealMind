package com.example.mealmind

import com.example.mealmind.api.RetrofitClient
import com.example.mealmind.model.FoodItem
import com.example.mealmind.model.FoodItemList
import com.example.mealmind.model.Meal
import com.example.mealmind.model.foodItemList

class FoodRepository {
    var retrofitClient = RetrofitClient.apiService
    suspend fun getFoodItems(query: String): List<Meal?>?{
        val response = retrofitClient.getMeals(query)
        return response.body()?.meals
    }
}