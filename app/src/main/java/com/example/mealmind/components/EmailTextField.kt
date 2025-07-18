package com.example.mealmind.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EmailTextField(
    modifier: Modifier = Modifier,
    hint: String = "",
    title: String = "Email",
    onChange: (String) -> Unit,
    emailText: String
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
        )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = emailText,
            onValueChange = {
                onChange(it)
            },
            placeholder = {
                Text(
                    text = hint
                )
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email
            ),
            singleLine = true
        )
    }

}
@Preview(showSystemUi = true)
@Composable
fun EmailTextFieldPreview(){

    EmailTextField(
        onChange = {},
        emailText = "fyta"
    )
}