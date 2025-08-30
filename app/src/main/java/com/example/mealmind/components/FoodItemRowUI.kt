package com.example.mealmind.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.mealmind.model.FoodItem
import com.example.mealmind.model.Meal

@Composable
fun FoodItemRowUI(modifier: Modifier = Modifier,
                  foodItem: Meal?,
                  onClick: (String?)->Unit
) {
    Column(
        modifier = modifier.fillMaxWidth().clickable{
            onClick(foodItem?.idMeal)
        }
    ){
        if (foodItem?.strMealThumb != null)
            AsyncImage(
                model = foodItem.strMealThumb,
                contentDescription = "",
                modifier = Modifier.height(150.dp).width(250.dp).clip(shape = RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop,

            )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = foodItem?.strMeal ?: "",
            fontSize = 32.sp
        )

    }

}