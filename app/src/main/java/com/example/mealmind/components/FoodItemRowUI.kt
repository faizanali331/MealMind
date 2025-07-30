package com.example.mealmind.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.mealmind.model.FoodItem

@Composable
fun FoodItemRowUI(modifier: Modifier = Modifier,
                  foodItem: FoodItem,
                  onClick: (Int)->Unit
) {
    Column(
        modifier = modifier.clickable{
            onClick(foodItem.id)
        }
    ){
        if (foodItem.image != null)
            AsyncImage(
                model = foodItem.image,
                contentDescription = "",
                modifier = Modifier.size(300.dp).clip(RoundedCornerShape(16.dp))
            )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = foodItem.foodName ?: "",
            fontSize = 32.sp
        )

    }

}