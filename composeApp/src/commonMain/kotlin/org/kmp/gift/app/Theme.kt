package org.kmp.gift.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// --- Custom Colors ---
private val PurplePrimary = Color(0xFF6200EE)
private val TealSecondary = Color(0xFF03DAC5)
private val DeepTertiary = Color(0xFF3700B3)

private val PurpleDarkPrimary = Color(0xFFBB86FC)
private val TealDarkSecondary = Color(0xFF03DAC5)
private val DeepDarkTertiary = Color(0xFF3700B3)

// --- Light Color Scheme ---
private val LightColorScheme = lightColorScheme(
    primary = PurplePrimary,
    onPrimary = Color.White,
    secondary = TealSecondary,
    tertiary = DeepTertiary,
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFFFFFFF),
    onSurface = Color.Black
)

// --- Dark Color Scheme ---
private val DarkColorScheme = darkColorScheme(
    primary = PurpleDarkPrimary,
    onPrimary = Color.Black,
    secondary = TealDarkSecondary,
    tertiary = DeepDarkTertiary,
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    onSurface = Color.White
)

// --- Theme Composable ---
@Composable
fun GiftAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}