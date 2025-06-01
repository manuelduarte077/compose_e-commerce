package dev.donmanuel.ecommerce.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.donmanuel.ecommerce.navigation.Screen
import dev.donmanuel.ecommerce.presentation.screens.component.ButtonBase
import dev.donmanuel.ecommerce.presentation.screens.component.LogoApp
import dev.donmanuel.ecommerce.presentation.screens.component.textfield.TextClick
import dev.donmanuel.ecommerce.presentation.screens.component.textfield.TextFieldBase
import dev.donmanuel.ecommerce.presentation.screens.component.textfield.TextFieldPassBase

@Composable
fun SignUpScreen(naveController: NavController) {
    val emailValue = remember { mutableStateOf("") }
    val nameValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("") }

    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val passwordValueConfirm = remember { mutableStateOf("") }
    val passwordVisibleConfirm = remember { mutableStateOf(false) }

    Scaffold(containerColor = MaterialTheme.colorScheme.background) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(18.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                LogoApp()

                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase(
                    text = "Nombre", 
                    textValue = nameValue,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase(
                    text = "Correo", 
                    textValue = emailValue,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase(
                    text = "Telefono", 
                    textValue = phoneValue,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassBase(
                    text = "Contraseña", 
                    textValue = passwordValue, 
                    passwordVisible = passwordVisible,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassBase(
                    text = "Confirmar Contraseña",
                    textValue = passwordValueConfirm,
                    passwordVisible = passwordVisibleConfirm,
                    modifier = Modifier.fillMaxWidth()
                )
                
                Spacer(modifier = Modifier.padding(20.dp))
                ButtonBase(
                    text = "Registrarse",
                    onClick = {
                        naveController.navigate(Screen.HomeScreen.route) {
                            popUpTo(Screen.SignUpScreen.route) {
                                inclusive = true
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.padding(6.dp))
                TextClick("Iniciar Sesión", onClick = {
                    naveController.navigate(Screen.LoginScreen.route) {
                        popUpTo(Screen.SignUpScreen.route) {
                            inclusive = true
                        }
                    }
                })
            }
        }
    }
}