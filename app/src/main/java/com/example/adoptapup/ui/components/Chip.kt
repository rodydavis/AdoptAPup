package com.example.adoptapup.ui.components

import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


@Composable
fun MaterialChip(
    label: String,
    icon: ImageVector? = null,
    selected: Boolean = true,
    onClick: () -> Unit
) {
    val foregroundColor = if (selected) MaterialTheme.colors.primary else Color.DarkGray
    val backgroundColor = if (selected) MaterialTheme.colors.background else Color.LightGray
    Box(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Surface(
            elevation = 1.dp,
            shape = MaterialTheme.shapes.small,
            color = backgroundColor
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (icon != null) Icon(
                    icon,
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(horizontal = 4.dp),
                    tint = foregroundColor
                )
                Text(
                    label,
                    modifier = Modifier.padding(8.dp),
                    style = MaterialTheme.typography.button.copy(color = foregroundColor)
                )
            }
        }
    }
}
