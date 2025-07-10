package com.example.mealmind

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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
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
            Image(
                painter = imageArrow,
                contentDescription = null,
                modifier = Modifier.size(40.dp).padding(5.dp)
                    .align(Alignment.TopStart)

            )
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
            Image(
                painter = follow,
                contentDescription = null,
                modifier = Modifier.size(80.dp).padding(5.dp)
            )
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
            text = " Green flacks with garlic&ginger curd",
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
        )
        Text(
            text = " 6 boiled eggs with pepper",
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