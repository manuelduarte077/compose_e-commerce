package dev.donmanuel.ecommerce.presentation.screens.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import composee_commerce.composeapp.generated.resources.Res
import composee_commerce.composeapp.generated.resources.burgerking
import dev.donmanuel.ecommerce.model.Category
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProductCard(
    title: String,
    subtitle: String,
    idImage: DrawableResource?,
    onItemClick: (Category) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(20.dp),
        shape = RoundedCornerShape(10.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(end = 5.dp),
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                val image: Painter = painterResource(
                    idImage ?: Res.drawable.burgerking
                )

                Image(
                    painter = image, contentDescription = "",
                    modifier = Modifier
                        .size(100.dp),
                    contentScale = ContentScale.Crop
                )

                Column(modifier = Modifier.padding(start = 3.dp).width(150.dp)) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                    )

                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.titleSmall
                    )
                }
            }
        }
    }
}