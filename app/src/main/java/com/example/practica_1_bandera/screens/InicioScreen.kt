package com.example.practica_1_bandera.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_1_bandera.ui.theme.Practica_1_BanderaTheme

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier){
        Text(text = "Inicio Screen")
    }
}

@Composable
fun JaponScreen(modifier: Modifier = Modifier) {
    val white = Color.White
    val red = Color(0xFFCE1126)

    Row(modifier = modifier) {
        Box(
            modifier
                .weight(1f) // cada franja ocupa 1/3 del alto
                .fillMaxWidth().height(200.dp)
                .background(white),
                contentAlignment = Alignment.Center
        ){
            Box(
                modifier
                    .size(50.dp)
                    .fillMaxWidth().height(200.dp)
                    .background(red, shape = CircleShape)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun FlagPreview() {
    Practica_1_BanderaTheme {
        JaponScreen()
    }
}

