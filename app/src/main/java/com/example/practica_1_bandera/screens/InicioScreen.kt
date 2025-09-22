package com.example.practica_1_bandera.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
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
fun ArgentinaScreen(modifier: Modifier = Modifier) {
    val white = Color.White
    val blue = Color(0xFF74ACDF)

    Row(modifier = modifier) {
        Box(
            modifier
                .weight(1f)
                .fillMaxWidth().height(200.dp)
                .background(blue)
        )

        Box(
            modifier
                .weight(1f)
                .fillMaxWidth().height(200.dp)
                .background(white),
                contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.sol_de_mayo),
                contentDescription = "Sol de Mayo",
                modifier = Modifier.size(120.dp)
            )
        }

        Box(
            modifier
                .weight(1f)
                .fillMaxWidth().height(200.dp)
                .background(blue)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun FlagPreview() {
    Practica_1_BanderaTheme {
        ArgentinaScreen()
    }
}

