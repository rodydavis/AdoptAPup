package com.example.adoptapup.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

//private val DarkColorPalette = darkColors(
//    primary = purple200,
//    primaryVariant = purple700,
//    secondary = teal200
//)

private val LightColorPalette = lightColors(
    primary = purpleDark,
    onPrimary = Color.White,
    surface = Color.White,
    background = pinkLight,
    secondary = tealLight

    /* Other default colors to override
background = Color.White,
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/
)

@Composable
fun AdoptAPupTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors =
//    if (darkTheme) {
//        DarkColorPalette
//    } else {
        LightColorPalette
//    }

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}