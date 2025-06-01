package dev.donmanuel.ecommerce.model

import composee_commerce.composeapp.generated.resources.Res
import composee_commerce.composeapp.generated.resources.alitas
import composee_commerce.composeapp.generated.resources.mariscos
import composee_commerce.composeapp.generated.resources.mexicana
import composee_commerce.composeapp.generated.resources.pasta
import composee_commerce.composeapp.generated.resources.pizza
import composee_commerce.composeapp.generated.resources.sushi
import org.jetbrains.compose.resources.DrawableResource

data class Category(
    val id: Int = 0,
    val categoryName: String = "",
    val categoryImage: DrawableResource? = null,
) {
    fun getCategories() = listOf(
        Category(
            0,
            "Pizza",
            Res.drawable.pizza
        ),
        Category(
            1,
            "Mexicana",
            Res.drawable.mexicana,
        ),
        Category(
            2,
            "Alitas",
            Res.drawable.alitas,
        ),
        Category(
            3,
            "Sushi",
            Res.drawable.sushi,
        ),
        Category(
            4,
            "Pasta",
            Res.drawable.pasta,
        ),
        Category(
            5,
            "Mariscos",
            Res.drawable.mariscos,
        )
    )
}