package dev.donmanuel.ecommerce.model

import composee_commerce.composeapp.generated.resources.Res
import composee_commerce.composeapp.generated.resources.alitas
import composee_commerce.composeapp.generated.resources.burgerking
import composee_commerce.composeapp.generated.resources.chillis
import composee_commerce.composeapp.generated.resources.chinas
import composee_commerce.composeapp.generated.resources.chopsuey
import composee_commerce.composeapp.generated.resources.donrafita
import composee_commerce.composeapp.generated.resources.gorditas
import composee_commerce.composeapp.generated.resources.hamburguesa
import composee_commerce.composeapp.generated.resources.italiana
import composee_commerce.composeapp.generated.resources.lasana
import composee_commerce.composeapp.generated.resources.wings
import org.jetbrains.compose.resources.DrawableResource

data class Company(
    val id: Int = 0,
    val name: String = "",
    val description: String = "",
    val deliveryPrice: String = "",
    val deliveryTime: String = "",
    val rating: String = "",
    val image: DrawableResource? = null,
    val products: List<Product> = listOf()
) {
    fun getCompanies() = listOf(
        Company(
            0,
            "Burger King",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "30.00",
            "45-55 min",
            "5.0",
            Res.drawable.burgerking,
            listOf(
                Product(
                    0,
                    "Hambuerguesa Res",
                    200.0,
                    Res.drawable.hamburguesa,
                    true

                ),
                Product(
                    1,
                    "Hambuerguesa Pollo",
                    500.0,
                    Res.drawable.hamburguesa,
                    false
                ),
                Product(
                    2,
                    "Hambuerguesa Puerco",
                    250.0,
                    Res.drawable.hamburguesa,
                    false
                ),
            ),
        ),
        Company(
            1,
            "Comida China",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "20.00",
            "25-40 min",
            "4.0",
            Res.drawable.chinas,
            listOf(
                Product(
                    0,
                    "Chop suey res",
                    200.0,
                    Res.drawable.chopsuey,
                    false

                ),
                Product(
                    1,
                    "Chop suey pollo",
                    500.0,
                    Res.drawable.chopsuey,
                    true
                ),
                Product(
                    2,
                    "Chop suey puerco",
                    250.0,
                    Res.drawable.chopsuey,
                    false
                ),
            )
        ),
        Company(
            2,
            "Italiano",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "40.00",
            "10-25 min",
            "3.0",
            Res.drawable.italiana,
            listOf(
                Product(
                    0,
                    "Lasana res",
                    200.0,
                    Res.drawable.lasana,
                    true

                ),
                Product(
                    1,
                    "Lasana pollo",
                    500.0,
                    Res.drawable.lasana,
                    true
                ),
                Product(
                    2,
                    "Lasana puerco",
                    250.0,
                    Res.drawable.lasana,
                    false
                ),
            )
        ),
        Company(
            3,
            "Don Rafita",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",

            "90.00",
            "45-60 min",
            "5.0",
            Res.drawable.donrafita,
            listOf(
                Product(
                    0,
                    "Gordita res",
                    200.0,
                    Res.drawable.gorditas,
                    false

                ),
                Product(
                    1,
                    "Gordita pollo",
                    500.0,
                    Res.drawable.gorditas,
                    false
                ),
                Product(
                    2,
                    "Gordita puerco",
                    250.0,
                    Res.drawable.gorditas,
                    true
                ),
            )
        ),
        Company(
            4,
            "Chilis",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "100.00",
            "05-15 min",
            "4.5",
            Res.drawable.chillis,
            listOf(
                Product(
                    0,
                    "Alitas habanero",
                    200.0,
                    Res.drawable.alitas,
                    false

                ),
                Product(
                    1,
                    "Alitas Bufalo",
                    500.0,
                    Res.drawable.wings,
                    true
                ),
                Product(
                    2,
                    "Papas",
                    250.0,
                    Res.drawable.wings,
                    false
                ),
            )
        )
    )
}
