package dev.donmanuel.ecommerce.presentation.screens

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import dev.donmanuel.ecommerce.model.Company

@Composable
fun DetailsScreen(navController: NavController, index: Int) {
    val company = Company().getCompanies()[index]

    Scaffold {
        Text(
            text = company.name
        )
    }
}