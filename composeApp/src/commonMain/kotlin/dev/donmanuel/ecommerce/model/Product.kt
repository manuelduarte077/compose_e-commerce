package dev.donmanuel.ecommerce.model

import org.jetbrains.compose.resources.DrawableResource

data class Product(
    val id: Int = 0,
    val name: String = "",
    val price: Double = 0.0,
    val image: DrawableResource,
    val isPopular: Boolean = false,
)