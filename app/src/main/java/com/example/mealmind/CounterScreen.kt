package com.example.mealmind

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

//@Composable
//fun CounterScreen(modifier: Modifier = Modifier) {
//    val mealViewModel: FoodViewModel = viewModel()
//    LaunchedEffect(null) {
//        mealViewModel.startCounter()
//    }
//    val counter = mealViewModel.counter.collectAsState()
//    Text(
//        text = counter.value.toString()
//    )
//}