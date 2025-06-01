package dev.donmanuel.ecommerce.presentation.screens.component.card

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun TagCard(tag: String = "", icon: ImageVector? = null) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary
        ), shape = RoundedCornerShape(12.dp), modifier = Modifier.padding(3.dp)
    ) {
        if (tag.isNotEmpty()) Text(
            text = tag, modifier = Modifier.padding(
                10.dp, 5.dp, 10.dp, 5.dp
            ), color = MaterialTheme.colorScheme.onPrimary
        )
        else icon?.let {
            Icon(
                it,
                tint = MaterialTheme.colorScheme.onPrimary,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
            )
        }
    }

}