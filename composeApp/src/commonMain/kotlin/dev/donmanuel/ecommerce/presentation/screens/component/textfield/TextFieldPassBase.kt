package dev.donmanuel.ecommerce.presentation.screens.component.textfield

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import composee_commerce.composeapp.generated.resources.Res
import composee_commerce.composeapp.generated.resources.ic_baseline_remove_red_eye_24
import org.jetbrains.compose.resources.painterResource

@Composable
fun TextFieldPassBase(
    text: String,
    textValue: MutableState<String>,
    passwordVisible: MutableState<Boolean>,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        trailingIcon = {
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(
                    painter = painterResource(Res.drawable.ic_baseline_remove_red_eye_24),
                    tint = if (passwordVisible.value) MaterialTheme.colorScheme.primary else Color.Gray,
                    contentDescription = ""
                )
            }
        },
        label = {
            Text(
                text = text,
                color = MaterialTheme.colorScheme.onBackground
            )
        },
        singleLine = true,
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
        modifier = modifier,
    )
}