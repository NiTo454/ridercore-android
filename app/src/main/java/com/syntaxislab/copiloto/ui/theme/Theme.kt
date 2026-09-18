package com.syntaxislab.copiloto.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = CyanAccent,
    secondary = FuchsiaAccent,
    background = DarkBackground,
    surface = DarkSurface
)

@Composable
fun CopilotoTheme(
    content: @Composable () -> Unit
) {
    // Como tu Trello pide Dark Mode, forzamos el esquema oscuro
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}