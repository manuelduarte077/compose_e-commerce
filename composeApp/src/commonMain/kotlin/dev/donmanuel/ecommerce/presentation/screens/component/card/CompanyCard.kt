package dev.donmanuel.ecommerce.presentation.screens.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import dev.donmanuel.ecommerce.model.Company
import org.jetbrains.compose.resources.painterResource

@Composable
fun CompanyCard(
    company: Company, onItemClick: (company: Company) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
            .clickable { onItemClick(company) },
        elevation = CardDefaults.elevatedCardElevation(5.dp)
    ) {
        Column {
            if (company.image != null) {
                Image(
                    painter = painterResource(company.image),
                    contentDescription = company.name,
                    modifier = Modifier.height(150.dp).fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = company.name,
                        style = MaterialTheme.typography.titleMedium
                    )

                    Text(
                        text = "Costo de envio: ${company.deliveryPrice} . ${company.deliveryTime} ",
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                TagCard(
                    tag = company.rating,
                )
            }
        }
    }

}

