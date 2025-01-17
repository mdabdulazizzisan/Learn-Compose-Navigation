package com.kolu.learncomposenavigation.basicnavigation.navigation

import ScreenA
import ScreenB
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BasicNavigation(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = BasicNavScreens.ScreenA,
        contentAlignment = Alignment.Center

    ){
        composable<BasicNavScreens.ScreenA> {
            ScreenA(navController = navController)
        }
        composable<BasicNavScreens.ScreenB> {
            ScreenB(navController = navController)
        }
    }
}
