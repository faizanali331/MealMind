package com.example.mealmind.components
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun PasswordTextField(
    modifier: Modifier = Modifier,
    hint: String = "",
    title: String = "Password",
    onChange: (String) -> Unit,
    passwordText: String
) {

    var isPasswordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxWidth().padding(25.dp)
    ) {
        Text(
            text = title
        )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = passwordText,
            onValueChange = {
                onChange(it)
            },
            placeholder = {
                Text(
                    text = hint
                )
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password
            ),
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                Icon(
                    imageVector = if (isPasswordVisible)Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown ,
                    contentDescription = "",
                    modifier = Modifier.clickable {
                        isPasswordVisible = !isPasswordVisible

                    }
                )
            }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PasswordTextFieldPreview(){
    PasswordTextField(
        onChange = {},
        passwordText = "46893u9"
    )
}