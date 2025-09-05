package com.example.mealmind.components

import androidx.compose.runtime.*
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
fun NameTextField(
    modifier: Modifier = Modifier,
    hint: String = "",
    title: String = "Name",
    onChange: (String) -> Unit,
    nameText: String
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
        )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = nameText,
            onValueChange = {
                onChange(it)
            },
            placeholder = {
                Text(
                    text = hint
                )
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text
            )
        )
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NameTextFieldPreview(){

    NameTextField(
        onChange = {},
        nameText = "fyta"
    )
}