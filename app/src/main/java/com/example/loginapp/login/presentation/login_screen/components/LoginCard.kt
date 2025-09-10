package com.example.loginapp.login.presentation.login_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.loginapp.R
import com.example.loginapp.login.presentation.login_screen.LoginScreenState
import com.example.loginapp.ui.theme.LocalTheme
import com.example.loginapp.ui.theme.LoginAppTheme

@Composable
fun LoginCard(
    state: LoginScreenState,
    onUsernameInput: (String) -> Unit,
    onPasswordInput: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val theme = LocalTheme.current
    val shape = RoundedCornerShape(12.dp)

    Column(
        modifier = modifier
            .width(IntrinsicSize.Min)
            .shadow(elevation = 4.dp, shape = shape, ambientColor = theme.shadowColor, spotColor = theme.shadowColor)
            .clip(shape)
            .background(theme.surfaceLight)
            .border(width = 1.dp, color = theme.borderPrimary, shape = shape)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LabeledTextField(
            textFieldValue = state.usernameField,
            onInput = onUsernameInput,
            labelTextId = R.string.username_label,
            placeholderTextId = R.string.username_placeholder,
            isError = state.isUsernameError,
        )

        Spacer(Modifier.height(16.dp))

        LabeledTextField(
            textFieldValue = state.passwordField,
            onInput = onPasswordInput,
            labelTextId = R.string.password_label,
            placeholderTextId = R.string.password_placeholder,
            isError = state.isPasswordError,
        )

        Spacer(Modifier.height(16.dp))

        LoginButton(
            modifier = Modifier.fillMaxWidth(),
            onLogin = {},
            isEnabled = state.isLoginEnabled // continue impl
        )
    }
}

@PreviewLightDark
@Composable
private fun LoginCardPreview() {
    LoginAppTheme {
        Box(modifier = Modifier.fillMaxSize().background(LocalTheme.current.surface), contentAlignment = Alignment.Center) {
            LoginCard(
                state = LoginScreenState(

                ),
                onUsernameInput = {},
                onPasswordInput = {},
                modifier = Modifier
            )
        }
    }
}