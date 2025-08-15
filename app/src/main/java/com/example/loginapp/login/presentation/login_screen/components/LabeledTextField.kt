package com.example.loginapp.login.presentation.login_screen.components

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.loginapp.R
import com.example.loginapp.ui.theme.CustomTheme
import com.example.loginapp.ui.theme.LocalTheme
import com.example.loginapp.ui.theme.LocalTypography
import com.example.loginapp.ui.theme.LoginAppTheme
import com.example.loginapp.ui.theme.darkThemeColors
import com.example.loginapp.ui.theme.lightThemeColors

@Composable
fun LabeledTextField(
    textFieldValue: String,
    onInput: (String) -> Unit,
    @StringRes labelTextId: Int,
    @StringRes placeholderTextId: Int,
    isError: Boolean,
    modifier: Modifier = Modifier
) {
    val theme = LocalTheme.current
    val typography = LocalTypography.current

    Column(
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = stringResource(labelTextId),
            style = typography.body,
            color = theme.textPrimary

        )
        TextField(
            value = textFieldValue,
            onValueChange = onInput,
            placeholder = {
                Text(
                    text = stringResource(placeholderTextId),
                    style = typography.caption,
                    color = theme.buttonDisabled
                )
            },
            colors = labeledTextFieldColors(theme),
            textStyle = typography.body,
            isError = isError,
            singleLine = true
        )
    }
}

@Composable
private fun labeledTextFieldColors(theme: CustomTheme): TextFieldColors {
    return TextFieldDefaults.colors(
        unfocusedContainerColor = Color.Transparent,
        focusedContainerColor = Color.Transparent,
        disabledContainerColor = Color.Transparent,
        errorContainerColor = Color.Transparent,
        unfocusedIndicatorColor = theme.borderPrimary,
        focusedIndicatorColor = theme.iconPrimary,
        disabledIndicatorColor = theme.borderPrimary.copy(alpha = 0.3f),
        errorIndicatorColor = theme.borderError,
        cursorColor = theme.iconPrimary,
        errorCursorColor = theme.borderError,
        focusedLabelColor = theme.iconPrimary,
        unfocusedLabelColor = theme.textPrimary.copy(alpha = 0.7f),
        errorLabelColor = theme.borderError,
        focusedPlaceholderColor = theme.textPrimary.copy(alpha = 0.5f),
        unfocusedPlaceholderColor = theme.textPrimary.copy(alpha = 0.5f),
        errorPlaceholderColor = theme.borderError,
        focusedTextColor = theme.textPrimary,
        unfocusedTextColor = theme.textPrimary.copy(alpha = 0.7f),
        disabledTextColor = theme.textPrimary.copy(alpha = 0.4f),
        errorTextColor = theme.borderError
    )
}

@PreviewLightDark
@Composable
private fun LabeledTextFieldPreview() {
    LoginAppTheme {
        LabeledTextField(
            textFieldValue = "John",
            onInput = {},
            labelTextId = R.string.username_label,
            placeholderTextId = R.string.username_placeholder,
            isError = false,
            modifier = Modifier
                .background(LocalTheme.current.surfaceLight),
        )
    }
}
