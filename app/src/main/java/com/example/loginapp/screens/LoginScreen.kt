package com.example.loginapp.screens

import com.example.loginapp.navigation.Routes
import com.example.loginapp.screens.RegisterScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.compose.composable

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("vijaybhuva90@gmail.com") }
    var password by remember { mutableStateOf("••••••") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Login", style = MaterialTheme.typography.headlineLarge, modifier = Modifier.padding(bottom = 32.dp))

        // Campo de Email
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
        )


        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp)
        )

        // Botón Login
        Button(
            onClick = { /* Lógica de Login */ },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onSurface)
        ) {
            Text("Login", color = MaterialTheme.colorScheme.surface)
        }

        Spacer(modifier = Modifier.height(50.dp))

        // Navegación a Registro
        Text(
            text = "Don't have any account? Sign Up",
            modifier = Modifier
                .clickable {
                    // Navega a RegisterScreen
                    navController.navigate(Routes.RegisterScreenRoute)
                },
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary
        )
    }
}