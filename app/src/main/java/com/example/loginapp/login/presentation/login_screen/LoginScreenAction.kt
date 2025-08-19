package com.example.loginapp.login.presentation.login_screen

sealed interface LoginScreenAction {
    data class OnUsernameInput(val usernameInput: String): LoginScreenAction
    data class OnPasswordInput(val passwordInput: String): LoginScreenAction
    data object OnLogin : LoginScreenAction
}