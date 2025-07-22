package com.example.mealmind.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mealmind.model.FoodItem

@Composable
fun FoodItemUI(modifier: Modifier = Modifier, foodItem: FoodItem) {
    Row(
        modifier = modifier
    ){
        if (foodItem.image != null)
            Image(
                modifier = Modifier.size(80.dp),
                painter = painterResource(foodItem.image),
                contentDescription = "",
            )

        Text(
            text = foodItem.foodName ?: ""
        )

    }
}