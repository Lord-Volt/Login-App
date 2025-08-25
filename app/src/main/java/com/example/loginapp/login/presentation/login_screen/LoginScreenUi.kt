package com.example.loginapp.login.presentation.login_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.loginapp.R
import com.example.loginapp.login.presentation.login_screen.components.LoginCard
import com.example.loginapp.ui.theme.LocalTheme
import com.example.loginapp.ui.theme.LocalTypography
import com.example.loginapp.ui.theme.LoginAppTheme

@Composable
fun LoginScreenUi(
    state: LoginScreenState,
    onUsernameInput: (String) -> Unit,
    onPasswordInput: (String) -> Unit
) {
    val theme = LocalTheme.current
    val typography = LocalTypography.current

    Scaffold(

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(theme.surface),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                painter = painterResource(R.drawable.youji_icon),
                contentDescription = stringResource(R.string.youji_icon),
                tint = theme.textPrimary,
                modifier = Modifier.size(300.dp)
            )

            Text(
                text = "Youji",
                style = typography.header,
                color = theme.textPrimary
            )

            Spacer(modifier = Modifier.height(32.dp))

            LoginCard(
                state = state,
                onUsernameInput = onUsernameInput,
                onPasswordInput = onPasswordInput
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun LoginScreenPreview() {
    LoginAppTheme {
        LoginScreenUi(
            state = LoginScreenState(

            ),
            onUsernameInput = {},
            onPasswordInput = {}
        )
    }
}