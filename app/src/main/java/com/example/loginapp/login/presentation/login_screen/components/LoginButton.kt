package com.example.loginapp.login.presentation.login_screen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.loginapp.R
import com.example.loginapp.ui.theme.LocalTheme
import com.example.loginapp.ui.theme.LocalTypography
import com.example.loginapp.ui.theme.LoginAppTheme

@Composable
fun LoginButton(
    modifier: Modifier = Modifier,
    onLogin: () -> Unit,
    isEnabled: Boolean
) {
    val theme = LocalTheme.current
    val typography = LocalTypography.current
    val shape = RoundedCornerShape(6.dp)

    Button(
        modifier = modifier,
        onClick = onLogin,
        enabled = isEnabled,
        shape = shape,
        border = BorderStroke(1.dp, theme.borderPrimary),
        colors = ButtonDefaults.buttonColors(
            containerColor = theme.surface,
            contentColor = theme.textPrimary,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = theme.textPrimary.copy(alpha = 0.6f)
        ),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp)
    ) {
        Text(
            text = stringResource(R.string.login_text),
            style = typography.button
        )
    }
}

@PreviewLightDark
@Composable
private fun LoginButtonPreview() {
    LoginAppTheme {
        LoginButton(
            modifier = Modifier.background(LocalTheme.current.surfaceLight),
            onLogin = {},
            isEnabled = true
        )
    }
}