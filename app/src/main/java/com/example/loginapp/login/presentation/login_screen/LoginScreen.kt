package com.example.loginapp.login.presentation.login_screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.androidx.compose.koinViewModel

@Composable
fun LoginScreen(
    viewModel: LoginScreenViewModel = koinViewModel()
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    LoginScreenUi(
        state = state,
        onUsernameInput = { input ->
            viewModel.onAction(LoginScreenAction.OnUsernameInput(input))
        },
        onPasswordInput = { input ->
            viewModel.onAction(LoginScreenAction.OnPasswordInput(input))
        }
    )
}