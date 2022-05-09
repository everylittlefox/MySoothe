package com.dalili.mysoothe.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySootheTextField(
    value: String,
    onValueChange: (String) -> Unit = {},
    label: String = "",
    leadingIcon: (@Composable () -> Unit)? = null
) {
    TextField(
        value = value,
        label = { Text(label) },
        onValueChange = onValueChange,
        leadingIcon = leadingIcon,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface,
            unfocusedIndicatorColor = MaterialTheme.colors.onSurface
        )
    )
}