package com.example.adoptapup

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import com.example.adoptapup.ui.pages.HomeScreen
import com.example.adoptapup.ui.theme.AdoptAPupTheme

val TITLE: String = "aDopt a Pup";

class MainActivity : AppCompatActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdoptAPupTheme {
                val window: Window = getWindow()
                window.statusBarColor = MaterialTheme.colors.primary.toArgb()
                HomeScreen(TITLE)
            }
        }
    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdoptAPupTheme {
        HomeScreen(TITLE)
    }
}