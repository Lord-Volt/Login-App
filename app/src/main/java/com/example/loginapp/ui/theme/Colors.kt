package com.example.loginapp.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class CustomTheme(
    val surface: Color,
    val surfaceLight: Color,
    val textPrimary: Color,
    val textInverse: Color,
    val iconPrimary: Color,
    val borderPrimary: Color,
    val borderError: Color,
    val buttonPrimary: Color,
    val buttonDisabled: Color,
    val shadowColor: Color,   // soft shadow for the card
    val isDark: Boolean
)

val darkThemeColors = CustomTheme(
    surface = Color(0xFF0A0A0A),
    surfaceLight = Color(0xFF1F1F21),
    textPrimary = Color.White,
    textInverse = Color(0xFF0A0A0A),
    iconPrimary = Color(0xFF0A84FF),
    borderPrimary = Color(0x33FFFFFF),
    borderError = Color(0xFFFF453A),
    buttonPrimary = Color(0xFF0A84FF),
    buttonDisabled = Color(0xFF3A3A3C),
    shadowColor = Color.White.copy(alpha = 0.65f),  // soft light shadow
    isDark = true
)

val lightThemeColors = CustomTheme(
    surface = Color.White,
    surfaceLight = Color(0xFFF2F2F7),
    textPrimary = Color.Black,
    textInverse = Color.White,
    iconPrimary = Color(0xFF007AFF),
    borderPrimary = Color(0x33000000),
    borderError = Color(0xFFFF3B30),
    buttonPrimary = Color(0xFF007AFF),
    buttonDisabled = Color(0xFFC7C7CC),
    shadowColor = Color.Black.copy(alpha = 0.75f),  // soft dark shadow
    isDark = false
)

val LocalTheme = staticCompositionLocalOf<CustomTheme> {
    error("No colors provided.")
}
