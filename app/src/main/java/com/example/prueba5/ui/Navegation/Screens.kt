package com.example.prueba5.ui.Navegation

sealed class Screens(val route: String){
    object Home: Screens(route = "home")
    object Second: Screens(route = "second")

}
