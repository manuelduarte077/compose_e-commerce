package dev.donmanuel.ecommerce.presentation.screens.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import composee_commerce.composeapp.generated.resources.Res
import composee_commerce.composeapp.generated.resources.applogo
import org.jetbrains.compose.resources.painterResource

@Composable
fun LogoApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(Res.drawable.applogo),
            contentDescription = "Logo App",
            modifier = Modifier.size(100.dp)
        )

        Text(
            text = "E-commerce",
            fontSize = 30.sp,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                letterSpacing = 5.sp,
                color = MaterialTheme.colorScheme.primary
            )
        )
    }
}