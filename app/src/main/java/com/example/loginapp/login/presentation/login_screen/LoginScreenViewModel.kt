package com.example.loginapp.login.presentation.login_screen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class LoginScreenViewModel(): ViewModel() {

    private val _state = MutableStateFlow(LoginScreenState())
    val state = _state.asStateFlow()

    fun onAction(action: LoginScreenAction) {
        when(action) {
            LoginScreenAction.OnLogin -> {
                TODO()
            }
            is LoginScreenAction.OnUsernameInput -> {
                updateLoginState(usernameInput = action.usernameInput)
            }
            is LoginScreenAction.OnPasswordInput -> {
                updateLoginState(passwordInput = action.passwordInput)
            }
        }
    }

    private fun updateLoginState(
        usernameInput: String? = null,
        passwordInput: String? = null
    ) {
        _state.update { current ->
            val newUsername = usernameInput ?: current.usernameField
            val newPassword = passwordInput ?: current.passwordField

            val usernameError = newUsername.length < 5
            val passwordError = newPassword.length < 3
            val loginEnabled = newUsername.isNotBlank() &&
                    newPassword.isNotBlank() &&
                    !usernameError &&
                    !passwordError

            current.copy(
                usernameField = newUsername,
                passwordField = newPassword,
                isUsernameError = usernameError,
                isPasswordError = passwordError,
                isLoginEnabled = loginEnabled
            )
        }
    }
}