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
                _state.update {
                    it.copy(
                        usernameField = action.usernameInput,
                        isUsernameError = action.usernameInput.length < 5
                    )
                }
            }
            is LoginScreenAction.OnPasswordInput -> {
                _state.update {
                    it.copy(
                        passwordField = action.passwordInput,
                        isPasswordError = action.passwordInput.length < 3
                    )
                }
            }
        }
    }
}