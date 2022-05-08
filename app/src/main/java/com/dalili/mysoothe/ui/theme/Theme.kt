package com.dalili.mysoothe.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = White,
    onPrimary = Gray900,
    secondary = Rust300,
    onSecondary = Gray900,
    background = Gray900,
    onBackground = Taupe100,
    surface = White150,
    onSurface = White800,
)

private val LightColorPalette = lightColors(
    primary = Gray900,
    onPrimary = White,
    secondary = Rust600,
    onSecondary = White850,
    background = Taupe100,
    onBackground = Taupe800,
    surface = White850,
    onSurface = Gray800,
)

@Composable
fun MySootheTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}