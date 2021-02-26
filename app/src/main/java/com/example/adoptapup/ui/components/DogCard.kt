package com.example.adoptapup.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.adoptapup.data.Dog

@Composable
fun DogCard(dog: Dog) {
    val expanded = mutableStateOf(false)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Card(
            backgroundColor = MaterialTheme.colors.surface,
            elevation = 0.dp,
            shape = MaterialTheme.shapes.small
        ) {
            Column {
                Image(
                    imageResource(dog.image),
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(),
                    alignment = Alignment.TopCenter,
                    contentScale = ContentScale.Crop
                )
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(dog.name, style = MaterialTheme.typography.h6)
                    Text(dog.description, style = MaterialTheme.typography.caption)
                    if (expanded.value) {
                        Column {
                            Box(modifier = Modifier.height(10.dp))
                            Text(
                                "Interested in adopting a pup? Send us your contact info and we'll be in touch!",
                            )
                            buildTextField("Full Name", true)
                            buildTextField("Phone", true)
                            buildTextField("State", true)
                            Text(
                                "When should we call you?"
                            )
                            var selectedTime by remember { mutableStateOf<Int?>(null) }
                            Row {
                                MaterialChip(
                                    "Morning",
                                    Icons.Filled.Star,
                                    selected = selectedTime == 0
                                ) {
                                    selectedTime = 0
                                }
                                MaterialChip(
                                    "Afternoon",
                                    Icons.Filled.ThumbUp,
                                    selected = selectedTime == 1
                                ) {
                                    selectedTime = 1
                                }
                            }
                            Row {
                                MaterialChip(
                                    "Evening",
                                    Icons.Filled.Done,
                                    selected = selectedTime == 2
                                ) {
                                    selectedTime = 2
                                }
                                MaterialChip(
                                    "After Survivor",
                                    Icons.Filled.Home,
                                    selected = selectedTime == 3
                                ) {
                                    selectedTime = 3
                                }
                            }
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                TextButton(
                                    onClick = { expanded.value = false }) {
                                    Icon(Icons.Filled.Email)
                                    Text(
                                        "SEND INFO",
                                        style = MaterialTheme.typography.button
                                    )
                                }
                            }
                        }
                    } else {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            TextButton(
                                onClick = { expanded.value = true }) {
                                Icon(Icons.Filled.Add)
                                Text(
                                    "ADOPT",
                                    style = MaterialTheme.typography.button
                                )
                            }
                        }
                    }
                }

            }
        }
    }
}


@Composable
fun buildTextField(label: String, required: Boolean) {
    var textVal by remember { mutableStateOf("") }
    TextField(
        value = textVal,
        onValueChange = { textVal = it },
        isErrorValue = textVal.isEmpty(),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        label = { Text(text = label + if (required) "*" else "") },
    )
}
