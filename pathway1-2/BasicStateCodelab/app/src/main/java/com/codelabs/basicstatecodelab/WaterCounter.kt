package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }

        if (count > 0) {
            Text(
                text = "You've had ${count} galsess",
                modifier = modifier.padding(16.dp)
            )
        }

        Button(
            modifier = Modifier.padding(top = 8.dp),
            onClick = {
                count++
            },
            enabled = count < 10
        ) {
            Text("Add One")
        }
    }
}