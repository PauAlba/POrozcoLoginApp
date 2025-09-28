package com.example.loginapp



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable


import com.example.loginapp.navigation.Routes
import com.example.loginapp.screens.LoginScreen
import com.example.loginapp.screens.RegisterScreen
import com.example.loginapp.ui.theme.LoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAppTheme {
                AppNavigation()
                // }
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.LoginScreenRoute::class
    ) {

        composable<Routes.LoginScreenRoute> {
            LoginScreen(navController = navController)
        }

        composable<Routes.RegisterScreenRoute> {
            RegisterScreen(navController = navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   LoginAppTheme {
       AppNavigation()
   }
}