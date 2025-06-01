package dev.donmanuel.ecommerce.presentation.screens

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import composee_commerce.composeapp.generated.resources.*
import dev.donmanuel.ecommerce.presentation.screens.component.BottomBarApp
import dev.donmanuel.ecommerce.presentation.screens.component.TopBarApp
import dev.donmanuel.ecommerce.presentation.screens.composables.CategoriesFragment
import dev.donmanuel.ecommerce.presentation.screens.composables.CompaniesFragment
import dev.donmanuel.ecommerce.presentation.screens.composables.OrderCardFragment
import dev.donmanuel.ecommerce.presentation.screens.composables.ProfileFragment
import org.jetbrains.compose.resources.DrawableResource

@Composable
fun HomeScreen(naveController: NavController) {
    val navItems = Section.entries
    val section = remember { mutableStateOf(Section.Companies) }
    val currentTheme = isSystemInDarkTheme()


    Scaffold(
        contentColor = MaterialTheme.colorScheme.background,
        modifier = Modifier.padding(15.dp),
        topBar = {
            Crossfade(targetState = section.value) { section ->
                when (section) {
                    Section.Companies ->
                        TopBarApp(
                            "Restaurantes",
                            "Pide tu comida para llevar",
                            Res.drawable.ic_baseline_lightbulb_24,
                            onIconClick = { }
                        )

                    Section.Explore ->
                        TopBarApp(
                            "Categorias",
                            "Categorias principales",
                            Res.drawable.ic_baseline_search_24,
                            onIconClick = {})

                    Section.Orders ->
                        TopBarApp(
                            "Carrito",
                            "Productos adquiridos",
                            Res.drawable.ic_baseline_filter_list_24,
                            onIconClick = {})

                    Section.Profile ->
                        TopBarApp(
                            "Perfil",
                            "Datos personales",
                            Res.drawable.ic_baseline_logout_24,
                            onIconClick = {})
                }
            }
        },
        bottomBar = {
            BottomBarApp(
                items = navItems,
                currentSection = section.value,
                onSectionSelected = { section.value = it }
            )

        }) { innerPadding ->
        Crossfade(
            modifier = Modifier.padding(innerPadding),
            targetState = section.value
        ) { section ->
            when (section) {
                Section.Companies -> CompaniesFragment(naveController)
                Section.Explore -> CategoriesFragment(naveController)
                Section.Orders -> OrderCardFragment(naveController)
                Section.Profile -> ProfileFragment(naveController)
            }
        }
    }
}


enum class Section(val icon: DrawableResource) {
    Companies(Res.drawable.ic_baseline_home_24),
    Explore(Res.drawable.ic_baseline_search_24),
    Orders(Res.drawable.ic_baseline_shopping_cart_24),
    Profile(Res.drawable.ic_baseline_person_24)
}
