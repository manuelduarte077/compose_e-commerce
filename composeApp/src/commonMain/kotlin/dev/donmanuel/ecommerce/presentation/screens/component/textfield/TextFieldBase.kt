package dev.donmanuel.ecommerce.presentation.screens.component.textfield

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

@Composable
fun TextFieldBase(
    text: String,
    textValue: MutableState<String>,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        label = {
            Text(
                text = text,
                color = MaterialTheme.colorScheme.onBackground
            )
        },
        singleLine = true,
        modifier = modifier
    )
}