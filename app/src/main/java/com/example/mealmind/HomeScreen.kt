package com.example.mealmind

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mealmind.components.EmailTextField
import com.example.mealmind.components.FoodItemRowUI
import com.example.mealmind.components.FoodItemUI
import com.example.mealmind.components.SearchBar
import com.example.mealmind.model.foodItemList

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var searchText by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top=32.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(R.drawable.chef2),
                contentDescription = "",
                modifier = Modifier.size(40.dp).clip(CircleShape)
            )
            Spacer(modifier= Modifier.width(8.dp))
            Column(verticalArrangement = Arrangement.spacedBy(0.dp))
                {
                Text(
                    text = "Welcome",
                    color = Color.LightGray,
                    fontSize = 14.sp
                )

                Text(
                    text = "Tasya Aulianza",
                    fontSize = 18.sp

                )
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(
                onClick = {

                }
            ) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Notification",
                    tint = Color.Gray,
                    //modifier = Modifier.size(24.dp)
                )
            }
        }
        LazyRow(
            modifier = Modifier.padding(top=0.dp)
        ) {
            items(items = foodItemList) { foodItem ->
                FoodItemRowUI(foodItem = foodItem, onClick = { id ->
                    val item = foodItemList.first { it.id == id }
                    Toast.makeText(context, item.foodName, Toast.LENGTH_SHORT).show()
                })
                Spacer(
                    modifier = Modifier.width(15.dp)
                )
            }
        }
        SearchBar(
            modifier = Modifier.fillMaxWidth().padding(top = 0.dp),
            hint = "type ingredients...",
            title = "",
            onChange = {
                searchText = it
            },
            searchText=searchText
        )
        LazyColumn(
//            modifier = modifier,
//            contentPadding = PaddingValues(16.dp)
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(0.dp)
        ) {
            items(items = foodItemList) { foodItem ->
                FoodItemUI(foodItem = foodItem, onClick = { id ->
                    val item = foodItemList.first { it.id == id }
                    Toast.makeText(context, item.foodName, Toast.LENGTH_SHORT).show()
                })
                Spacer(
                    modifier = Modifier.height(5.dp)
                )
            }
        }
    }
}

@Composable
fun Imgage() {
    TODO("Not yet implemented")
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){

}

