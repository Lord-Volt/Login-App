package com.example.loginapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun LoginAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) darkThemeColors else lightThemeColors
    val typography = defaultCustomTypography

    CompositionLocalProvider(
        LocalTheme provides colorScheme,
        LocalTypography provides typography
    ) {
        content()
    }
}