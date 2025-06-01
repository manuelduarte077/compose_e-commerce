package dev.donmanuel.ecommerce.presentation.screens.component

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBase(
    text: String, onClick: () -> Unit, modifier: Modifier = Modifier
) {
    Button(
        onClick = { onClick() },
        modifier = modifier,
        shape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50)),
        colors = ButtonDefaults.buttonColors(),
    ) {
        Text(
            text = text, fontSize = 16.sp, modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}