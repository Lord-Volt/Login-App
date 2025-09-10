package com.example.loginapp.login.presentation.login_screen

data class LoginScreenState(
    val usernameField: String = "",
    val passwordField: String = "",
    val isUsernameError: Boolean = false,
    val isPasswordError: Boolean = false,
    val isLoginEnabled: Boolean = false,
    val isLoading: Boolean = false
)