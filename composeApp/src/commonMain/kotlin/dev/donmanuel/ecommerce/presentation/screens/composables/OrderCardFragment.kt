package dev.donmanuel.ecommerce.presentation.screens.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.donmanuel.ecommerce.model.Order
import dev.donmanuel.ecommerce.presentation.screens.component.card.ProductCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderCardFragment(navController: NavController) {
    val orders = Order().getOrders()

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        LazyColumn(
            Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            items(orders) {
                ProductCard(
                    it.title,
                    "${it.count} Articulos \n MXN ${it.total} \n ${it.directory}",
                    it.image,
                    onItemClick = {}
                )
            }
        }
        Button(
            onClick = { },
            modifier = Modifier.height(50.dp).width(150.dp)
        ) {
            Text(
                text = "PAGAR",
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}