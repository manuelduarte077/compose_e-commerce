package dev.donmanuel.ecommerce.presentation.screens.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import composee_commerce.composeapp.generated.resources.*
import dev.donmanuel.ecommerce.model.Category
import dev.donmanuel.ecommerce.model.Company
import dev.donmanuel.ecommerce.navigation.Screen
import dev.donmanuel.ecommerce.presentation.screens.component.card.CompanyCard
import dev.donmanuel.ecommerce.presentation.screens.component.card.TagCard
import org.jetbrains.compose.resources.painterResource

@Composable
fun CompaniesFragment(navController: NavController) {
    val companies = Company().getCompanies()

    LazyColumn {
        item {
            Text(text = "Ahora . Bilwi, Puerto Cabezas #1234")
            Spacer(modifier = Modifier.padding(10.dp))
            Slides()
            Spacer(modifier = Modifier.padding(10.dp))
            Categories()
        }

        items(companies.size) { index ->
            CompanyCard(
                companies[index],
                onItemClick = {
                    navController.navigate("${Screen.DetailsScreen.route}/${index}")
                })
        }
    }
}

@Composable
fun Slides() {
    val images = listOf(
        Res.drawable.alitas,
        Res.drawable.chillis,
        Res.drawable.mariscos,
        Res.drawable.chinas,
        Res.drawable.burgerking
    )
    val pagerState = rememberPagerState(
        initialPage = 1,
        pageCount = { images.size }
    )

    HorizontalPager(
        state = pagerState,
        modifier = Modifier.height(150.dp)
    ) { page ->
        Image(
            painter = painterResource(images[page]), contentDescription = "",
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun Categories() {

    val categories = Category().getCategories()
    Column {
        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                ) {
                    append("¿Estas buscando otra cosa? \n")
                }
                withStyle(
                    style = SpanStyle(
                        fontSize = 22.sp
                    )
                ) {
                    append("Buscar categoria")
                }
            },
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.padding(10.dp))
        LazyRow {
            items(categories.size) { index ->
                val category = categories[index]

                TagCard(
                    category.categoryName,
                )
            }
        }
    }
}