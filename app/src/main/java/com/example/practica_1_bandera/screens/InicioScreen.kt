package com.example.practica_1_bandera.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun InicioScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier){
        Text(text = "Inicio Screen")
    }
}