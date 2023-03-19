package com.example.prueba5.ui.Navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.prueba5.screens.HomeScreen



@Composable
fun NavGraph(
    navController: NavHostController
){
    NavHost(
        navController=navController,
        startDestination=Screens.Home.route
    ){
        composable(route=Screens.Home.route){
            HomeScreen()
        }

    }
}