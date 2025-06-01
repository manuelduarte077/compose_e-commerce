package dev.donmanuel.ecommerce

import androidx.compose.runtime.Composable
import dev.donmanuel.ecommerce.navigation.Navigation
import dev.donmanuel.ecommerce.presentation.theme.EcommerceTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    EcommerceTheme {
        Navigation()
    }
}