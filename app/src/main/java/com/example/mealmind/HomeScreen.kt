package com.example.mealmind

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.magnifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mealmind.components.FoodItemUI
import com.example.mealmind.model.foodItemList

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    LazyColumn(
       modifier = modifier,
        contentPadding = PaddingValues(16.dp)
    ) {
        items(items = foodItemList) { foodItem ->
            FoodItemUI(foodItem=foodItem)
            Spacer(
                modifier = Modifier.height(16.dp)
            )
        }
    }
}