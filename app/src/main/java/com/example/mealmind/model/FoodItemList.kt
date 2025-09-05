package com.example.mealmind.model


import com.google.gson.annotations.SerializedName

data class FoodItemList(
    @SerializedName("meals")
    val meals: List<Meal?>?
)