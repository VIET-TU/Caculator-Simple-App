package com.example.cauculartor

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp



@Composable
fun CaculatorButton (
    symbol: String,
    modifier: Modifier,
    onCLick: () -> Unit
) {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onCLick() }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            color = Color.White,
            fontSize = 36.sp
        )
    }
}