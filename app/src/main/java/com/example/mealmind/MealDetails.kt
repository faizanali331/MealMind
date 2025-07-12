package com.example.mealmind

import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import com.example.mealmind.ui.theme.MealMindTheme
//import java.lang.reflect.Modifier

@Composable
fun MealDetails(imageChicken: Int, imageArrow: Int, dishName: String, rating: Int, pic: Int, follow: Int, modifier: Modifier){
    val image = painterResource(imageChicken)
    val imageArrow = painterResource(imageArrow)
    val rate = painterResource(rating)
    val pic = painterResource(pic)
    val follow = painterResource(follow)

    val context = LocalContext.current
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    Column(modifier = modifier.fillMaxSize()) {

        Box(modifier = Modifier
            .fillMaxWidth().height(screenHeight * 0.4f)
            ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(400.dp).padding(5.dp)
            )
            val context = LocalContext.current

            IconButton(
                onClick = {
                    Toast.makeText(context, "Backed", Toast.LENGTH_SHORT).show()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
//            Image(
//                painter = imageArrow,
//                contentDescription = null,
//                modifier = Modifier.size(40.dp).padding(5.dp)
//                    .align(Alignment.TopStart)
//
//            )
            var isAdded by remember { mutableStateOf(false) }
            IconButton(
                onClick = {
                    isAdded = !isAdded
                    val message = if (isAdded) "Added" else "Unadded"
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

        Row() {
            Text(
                text = dishName,
                fontSize = 30.sp,
                fontWeight = FontWeight(800),
                modifier = Modifier.padding(10.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = rate,
                contentDescription = null,
                modifier = Modifier.size(60.dp).padding(5.dp)
            )
        }
        Row(){
            Image(
                painter = pic,
                contentDescription = null,
                modifier = Modifier.size(60.dp).padding(5.dp)
            )
            Column(){
                Text(
                    text = "Virat Kohli",
                    fontSize = 25.sp,
                    fontWeight = FontWeight(500),
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "@ViratKohli183",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(300),
                    modifier = Modifier.padding(0.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))

            var isFollowed by remember { mutableStateOf(false) }
            Button(
                onClick = {
                    isFollowed = !isFollowed
                    val message = if (isFollowed) "Unfollowed" else "Followed"
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isFollowed) Color.Red else Color.LightGray
                )
            ) {
                Text(
                    if(isFollowed) "Followed" else "Following"
                )
            }
//            Image(
//                painter = follow,
//                contentDescription = null,
//                modifier = Modifier.size(80.dp).padding(5.dp)
//            )
        }
        Text(
            text = "Description",
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 20.dp, bottom = 5.dp)

        )
        Text(
            text = "This amazing grilled Chicken very tasty also very healthy." +
                    " It contains 50 grams of protein",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        Text(
            text = " Ingredients",
            fontSize = 25.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 20.dp, bottom = 5.dp)
        )
        Text(
            text = " Chicken Breast",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
        )
        Text(
            text = " Green flacks with garlic&ginger curd roast it with chili powder and use some lemon and butter",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
        )
        Text(
            text = " 6 boiled eggs with pepper 50 grams of garlic paste and blend it with tomato until it became red",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
        )
        Text(
            text = " with pepper 50 grams of garlic paste and blend it with tomato until it became red",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
        )


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChickenPreview(){
    MealMindTheme {
        Scaffold(
            modifier = Modifier.statusBarsPadding().navigationBarsPadding()
        ) { padding ->
            MealDetails(
                R.drawable.chiecken,
                R.drawable.arrow,
                dishName = "Grilled Chicken",
                R.drawable.ratings,
                R.drawable.profile,
                R.drawable.flw,
                modifier = Modifier.padding(padding)

            )
        }
    }
}