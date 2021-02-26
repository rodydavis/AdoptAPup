package com.example.adoptapup.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.WithConstraints
import androidx.compose.ui.unit.dp
import com.example.adoptapup.data.Dog
import androidx.compose.ui.Modifier

@ExperimentalFoundationApi
@Composable
fun DogList(dogs: List<Dog>) {
    WithConstraints() {
        var columns = 1
        if (this.maxWidth > 400.dp) columns += 1
        if (this.maxWidth > 800.dp) columns += 1
        if (this.maxWidth > 1300.dp) columns += 1
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            cells = GridCells.Fixed(columns),
            contentPadding = PaddingValues(0.dp),
        ) {
            items(dogs) { dog ->
                DogCard(dog)
            }
        }
    }
}