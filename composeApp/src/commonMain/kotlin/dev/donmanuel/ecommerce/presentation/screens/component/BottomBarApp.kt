package dev.donmanuel.ecommerce.presentation.screens.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.donmanuel.ecommerce.presentation.screens.Section
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomBarApp(
    items: List<Section>,
    currentSection: Section,
    onSectionSelected: (Section) -> Unit,
) {
    NavigationBar(
        modifier = Modifier.height(50.dp),
        contentColor = MaterialTheme.colorScheme.surface
    ) {
        items.forEach { section ->
            val selected = section == currentSection

            NavigationBarItem(
                selected = selected,
                onClick = { onSectionSelected(section) },
                icon = {
                    Icon(
                        painter = painterResource(section.icon),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp)
                    )
                },
            )
        }
    }
}