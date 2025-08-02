package com.example.mealmind.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.mealmind.model.FoodItem

@Composable
fun FoodItemUI(
    modifier: Modifier = Modifier,
               foodItem: FoodItem,
               onClick: (Int)->Unit
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Row(
            modifier = modifier.fillMaxWidth()

                .background(color = Color.Blue.copy(0.2f))
                .padding(top = 4.dp)
                .clickable {
                onClick(foodItem.id)
            }
        ) {
            if (foodItem.image != null)
                AsyncImage(
                    model = foodItem.image,
                    contentDescription = "",
                    modifier = Modifier.size(60.dp)
                )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = foodItem.foodName ?: "",
                fontSize = 16.sp
            )

        }
    }
}