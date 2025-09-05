package com.example.mealmind.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mealmind.R
import com.example.mealmind.components.EmailTextField
import com.example.mealmind.components.NameTextField
import com.example.mealmind.components.PasswordTextField

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    var nameText by remember { mutableStateOf("") }
    var emailText by remember { mutableStateOf("") }
    var passwordText by remember { mutableStateOf("")}
    Column(
        modifier = Modifier.fillMaxWidth().padding(10.dp)
    ){
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding(30.dp)
        ){
            IconButton(
                onClick = {},
                modifier = Modifier.size(20.dp).align(Alignment.Top)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "To Bookmark",
                    tint = Color.Black
                )
            }
            Spacer(modifier = Modifier.width(275.dp))
            Image(
                painter = painterResource(R.drawable.h),
                contentDescription = "",
                modifier = Modifier.size(20.dp)
            )
        }
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text = "Create your account",
            fontSize = 30.sp,
            fontWeight = FontWeight(600),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(30.dp))
        NameTextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
            hint = "ex. john",
            title = "Name",
            onChange = {
                emailText = it
            },
            nameText = nameText
        )
        Spacer(modifier = Modifier.height(10.dp))
        EmailTextField(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp),
            hint = "Enter Email",
            title = "Email",
            onChange = {
                emailText = it
            },
            emailText = emailText
        )
        //Spacer(modifier = Modifier.height(0.dp))
        PasswordTextField(
            modifier = Modifier.fillMaxWidth(),//.padding(horizontal = 24.dp),
            hint = "Enter Password",
            title = "Password",
            onChange = {
                passwordText = it
            },
            passwordText
        )
        //Spacer(modifier = Modifier.height(dp))
        PasswordTextField(
            modifier = Modifier.fillMaxWidth(),
            hint = "Enter Password",
            title = "Confirm Password",
            onChange = {
                passwordText = it
            },
            passwordText
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green
            ),
            modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp)
        ) {
            Text(
                "SIGN UP",
                fontSize = 25.sp,
                fontWeight = FontWeight(700)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "or sign up with",
            fontSize = 15.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ){

            IconButton(
                onClick = {},
                modifier = Modifier.width(80.dp).height(50.dp).background(color = Color.LightGray, shape = RoundedCornerShape(6.dp))
            ) {
                Icon(
                    painter = painterResource(R.drawable.gi),
                    contentDescription = "",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Unspecified

                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            IconButton(
                onClick = {},
                modifier = Modifier.width(80.dp).height(50.dp).background(color = Color.LightGray, shape = RoundedCornerShape(6.dp))
            ) {
                Icon(
                    painter = painterResource(R.drawable.fb),
                    contentDescription = "",
                    modifier = Modifier.size(50.dp),
                    tint = Color.Unspecified

                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            IconButton(
                onClick = {},
                modifier = Modifier.width(80.dp).height(50.dp).background(color = Color.LightGray, shape = RoundedCornerShape(15.dp))
            ) {
                Icon(
                    painter = painterResource(R.drawable.tt),
                    contentDescription = "",
                    modifier = Modifier.size(50.dp),
                    tint = Color.Unspecified

                )
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ){
            Text(
                text = " have an account ?  "
            )
            Text(
                text = "SIGN IN",
                color = Color.Green,
                modifier = Modifier.clickable {
                    // Handle click here
                }
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpScreenPreview(){
    SignUpScreen()
}