package com.example.prueba5.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.prueba5.ui.theme.Prueba5Theme

@Composable
fun HomeScreen(){
    Scaffold(
        topBar = {
            TopAppBar() {
                Text("Navegando en Compose")
            }
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text("Soy HomeScreen")
            Button(onClick = { /*TODO*/ }) {
                Text("Segunda pantalla")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    Prueba5Theme {
        HomeScreen()
    }
}