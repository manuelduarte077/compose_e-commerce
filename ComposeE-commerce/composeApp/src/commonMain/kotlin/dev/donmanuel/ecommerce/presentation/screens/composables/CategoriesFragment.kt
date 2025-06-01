package dev.donmanuel.ecommerce.presentation.screens.composables

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import dev.donmanuel.ecommerce.model.Category
import dev.donmanuel.ecommerce.presentation.screens.component.card.CategoryCard

@Composable
fun CategoriesFragment(navController: NavController) {
    val categories = Category().getCategories()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
    ) {
        items(categories) {
            CategoryCard(
                it,
                onItemClick = { }
            )
        }
    }
}