package com.example.practica_1_bandera.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica_1_bandera.R
import com.example.practica_1_bandera.ui.theme.Practica_1_BanderaTheme

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier){
        Text(text = "Inicio Screen")
    }
}

@Composable
fun MexicoScreen(modifier: Modifier = Modifier) {
    val green = Color(0xFF006847)
    val white = Color.White
    val red = Color(0xFFCE1126)

    Row(modifier = modifier) {
        Box(
            modifier = modifier
                .weight(1f) // cada franja ocupa 1/3 del alto
                .fillMaxWidth().height(200.dp)
                .background(green)
        )
        Box(
            modifier = modifier
                .weight(1f)
                .fillMaxWidth().height(200.dp)
                .background(white),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.aguila_logo),
                contentDescription = "Escudo de México",
                modifier = Modifier
                    .height(120.dp)
                    .aspectRatio(1f)
            )
        }
        Box(
            modifier = modifier
                .weight(1f)
                .fillMaxWidth().height(200.dp)
                .background(red)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun FlagPreview() {
    Practica_1_BanderaTheme {
        MexicoScreen()
    }
}