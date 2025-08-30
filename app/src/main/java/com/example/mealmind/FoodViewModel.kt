package com.example.mealmind

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mealmind.model.FoodItem
import com.example.mealmind.model.Meal
import com.example.mealmind.model.foodItemList
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FoodViewModel: ViewModel() {
    val foodRepository = FoodRepository()
    private val _foodItems = MutableStateFlow<List<Meal?>?>(emptyList())
    val foodItems: StateFlow<List<Meal?>?> = _foodItems
    fun getFoodItems(query: String) {
        viewModelScope.launch {
            Log.d("FoodViewModel", "getFoodItems is called")
            _foodItems.value = foodRepository.getFoodItems(query)
        }
    }


//    var counter = MutableStateFlow<Int>(0)
//    fun  startCounter(){
//        viewModelScope.launch {
//            Log.d("FoodViewModel", "startCounter is called")
//           // Log.d("MealViewModel", "insideStartCounter")
//            while(true){
//                delay(500)
//                counter.value=counter.value+1
//               // Log.d("MealViewModel", "${counter.value}")
//            }
//        }
//    }
}
