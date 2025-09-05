package com.example.mealmind

import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PlayArrow

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.mealmind.model.foodItemList
//import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import com.example.mealmind.ui.theme.MealMindTheme
//import java.lang.reflect.Modifier

@Composable
fun MealDetails(
    modifier: Modifier= Modifier,
    mealId: String,
    foodViewModel: FoodViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
){
    val foodDetail = foodViewModel.foodDetail.collectAsState()
//    val image = painterResource(imageChicken)
//    val imageArrow = painterResource(imageArrow)
//    val rate = painterResource(rating)
//    val pic = painterResource(pic)
//    val follow = painterResource(follow)
    LaunchedEffect(null) {
         foodViewModel.getFoodDetail(mealId)
    }
    val context = LocalContext.current
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    Column(modifier = modifier.fillMaxSize()) {

        Box(modifier = Modifier
            .fillMaxWidth().height(screenHeight * 0.4f)
            ) {
            AsyncImage(
                model = foodDetail.value?.strMealThumb,
                contentDescription = null,
                modifier = Modifier.fillMaxSize().padding(12.dp),  // Fills the entire available space
                contentScale = ContentScale.Crop
            )
            val context = LocalContext.current

            IconButton(
                onClick = {
                    Toast.makeText(context, "Backed", Toast.LENGTH_SHORT).show()
                }, modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back"
                )
            }

            var isAdded by remember { mutableStateOf(false) }
            IconButton(
                onClick = {
                    isAdded = !isAdded
                    val message = if (isAdded) "Added" else "Removed"
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "To Bookmark",
                        tint = if (isAdded) Color.Red else Color.Gray
                    )
                }
            }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = foodDetail.value?.strMeal ?: "",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(
                text = foodDetail.value?.strArea?:"",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 8.dp)

            )
            //Spacer(modifier = Modifier.weight(1f))
            Text(
                text = foodDetail.value?.strCategory ?: "",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 8.dp)
            )
//            Text(
//                text = foodDetail.value?.strTags ?: "",
//                fontSize = 20.sp,
//                fontWeight = FontWeight(300),
//                modifier = Modifier.padding(10.dp)
//            )
        }
//        Row(){
//            Image(
//                painter = pic,
//                contentDescription = null,
//                modifier = Modifier.size(60.dp).padding(5.dp)
//            )
//            Column(){
//                Text(
//                    text = "Virat Kohli",
//                    fontSize = 25.sp,
//                    fontWeight = FontWeight(500),
//                    modifier = Modifier.padding(10.dp)
//                )
//                Text(
//                    text = "@ViratKohli183",
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight(300),
//                    modifier = Modifier.padding(0.dp)
//                )
//            }
//            Spacer(modifier = Modifier.weight(1f))
//
//            var isFollowed by remember { mutableStateOf(false) }
//            Button(
//                onClick = {
//                    isFollowed = !isFollowed
//                    val message = if (isFollowed) "Unfollowed" else "Followed"
//                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
//                },
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = if (isFollowed) Color.Red else Color.LightGray
//                )
//            ) {
//                Text(
//                    if(isFollowed) "Followed" else "Following"
//                )
//            }
////            Image(
////                painter = follow,
////                contentDescription = null,
////                modifier = Modifier.size(80.dp).padding(5.dp)
////            )
//        }

        LazyColumn {
            item {
                Text(
                    text = "Instructions",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                )

                Text(
                    text = foodDetail.value?.strInstructions?:"",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure1
                        ?: "") + " " + (foodDetail.value?.strIngredient1 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure2
                        ?: "") + " " + (foodDetail.value?.strIngredient2 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure3
                        ?: "") + " " + (foodDetail.value?.strIngredient3 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure4
                        ?: "") + " " + (foodDetail.value?.strIngredient4 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure5
                        ?: "") + " " + (foodDetail.value?.strIngredient5 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure6
                        ?: "") + " " + (foodDetail.value?.strIngredient6 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure7
                        ?: "") + " " + (foodDetail.value?.strIngredient7 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure8
                        ?: "") + " " + (foodDetail.value?.strIngredient8 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure9
                        ?: "") + " " + (foodDetail.value?.strIngredient9 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure10
                        ?: "") + " " + (foodDetail.value?.strIngredient10 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure11
                        ?: "") + " " + (foodDetail.value?.strIngredient11 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure12
                        ?: "") + " " + (foodDetail.value?.strIngredient12 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure13
                        ?: "") + " " + (foodDetail.value?.strIngredient13 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure14
                        ?: "") + " " + (foodDetail.value?.strIngredient14 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure15
                        ?: "") + " " + (foodDetail.value?.strIngredient15 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure16
                        ?: "") + " " + (foodDetail.value?.strIngredient16 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure17
                        ?: "") + " " + (foodDetail.value?.strIngredient17 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure18
                        ?: "") + " " + (foodDetail.value?.strIngredient18 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure19
                        ?: "") + " " + (foodDetail.value?.strIngredient19 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
            item {
                Text(
                    text = (foodDetail.value?.strMeasure20
                        ?: "") + " " + (foodDetail.value?.strIngredient20 ?: ""),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }


//        IconButton(
//            onClick = {
//
//            },
//            modifier = Modifier.align(Alignment.CenterHorizontally)
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically,
//            ) {
//                Icon(
//                    imageVector = Icons.Default.PlayArrow,
//                    contentDescription = "Play Video",     // For accessibility
//                    tint = Color.Black                     // Icon color (you can change it)
//                )
//                Spacer(modifier = Modifier.width(8.dp))    // Like space between icon and text
//                Text(
//                    text = "Play Video",                   // The text next to icon
//                    color = Color.Black,                   // Text color
//                    fontSize = 16.sp                       // Font size
//                )
//            }
//        }

    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun ChickenPreview(){
//    MealMindTheme {
//        Scaffold(
//            modifier = Modifier.statusBarsPadding().navigationBarsPadding()
//        ) { padding ->
//            MealDetails(
//
//            )
//        }
//    }
//}