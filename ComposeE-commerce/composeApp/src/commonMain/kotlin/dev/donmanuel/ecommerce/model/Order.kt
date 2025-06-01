package dev.donmanuel.ecommerce.model

import composee_commerce.composeapp.generated.resources.Res
import composee_commerce.composeapp.generated.resources.chopsuey
import composee_commerce.composeapp.generated.resources.hamburguesa
import composee_commerce.composeapp.generated.resources.lasana
import org.jetbrains.compose.resources.DrawableResource

data class Order(
    val id: Int = 0,
    val title: String = "",
    val total: Double = 0.0,
    val count: Int = 0,
    val image: DrawableResource? = null,
    val directory: String = "",
) {
    fun getOrders() = listOf(
        Order(
            0,
            "Burger King",
            200.0,
            3,
            Res.drawable.hamburguesa,
            "Avenida alegria #1234",
        ),

        Order(
            1,
            "Comida China",
            100.0,
            1,
            Res.drawable.chopsuey,
            "Avenida alegria #1234",
        ),

        Order(
            2,
            "Intaliano",
            400.0,
            5,
            Res.drawable.lasana,
            "Avenida alegria #1234",
        ),
    )
}
