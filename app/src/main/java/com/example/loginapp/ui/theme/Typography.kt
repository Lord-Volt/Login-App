package com.example.loginapp.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class CustomTypography(
    val header: TextStyle,
    val title: TextStyle,
    val body: TextStyle,
    val caption: TextStyle,
    val button: TextStyle
)

val defaultCustomTypography = CustomTypography(
    header = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = (-0.5).sp
    ),
    title = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = (-0.25).sp
    ),
    body = TextStyle(
        fontSize = 17.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp
    ),
    caption = TextStyle(
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal,
        color = Color.Unspecified
    ),
    button = TextStyle(
        fontSize = 17.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.25.sp
    )
)

val LocalTypography = staticCompositionLocalOf<CustomTypography> {
    error("No typography provided")
}