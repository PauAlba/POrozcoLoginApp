package com.example.loginapp.navigation


import kotlinx.serialization.Serializable


@Serializable
data class UserCredentials(
    val email: String,
    val firstName: String
)


object Routes {


    @Serializable
    object LoginScreenRoute

    @Serializable
    object RegisterScreenRoute

}