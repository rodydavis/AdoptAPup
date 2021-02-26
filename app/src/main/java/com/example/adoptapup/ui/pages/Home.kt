package com.example.adoptapup.ui.pages

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.adoptapup.data.DogProvider
import com.example.adoptapup.ui.components.DogList

@ExperimentalFoundationApi
@Composable
fun HomeScreen(title: String) {
    val dogProvider = DogProvider()
    var currentIndex by remember {mutableStateOf(0)}
    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        topBar = {
            Column() {
                TopAppBar(
                    title = {
                        Text(
                            title,
                            color = MaterialTheme.colors.onPrimary
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = { }) {
                            Icon(Icons.Filled.Menu)
                        }
                    },
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = MaterialTheme.colors.onPrimary,
                    elevation = 12.dp
                )
                TabRow(
                    selectedTabIndex = currentIndex,
                    backgroundColor = MaterialTheme.colors.primary,
                    contentColor = MaterialTheme.colors.onPrimary
                ) {
                    dogProvider.allDogs.mapIndexed { index, dogGroup ->
                        buildTab(
                            dogGroup.name,
                            index == currentIndex
                        ) { -> currentIndex = index }
                    }
                }
            }
        },
        bodyContent = { DogList(dogProvider.getGroup(currentIndex).dogs) })
}

@Composable
fun buildTab(label: String, selected: Boolean, onClick: () -> Unit) {
    val selectedColor = MaterialTheme.colors.onPrimary
    val unSelectedColor = Color.LightGray
    Tab(
        selectedContentColor = selectedColor,
        unselectedContentColor = unSelectedColor,
        text = {
            Text(
                label,
                color = if (selected) selectedColor else unSelectedColor
            )
        },
        selected = selected,
        onClick = onClick
    )
}