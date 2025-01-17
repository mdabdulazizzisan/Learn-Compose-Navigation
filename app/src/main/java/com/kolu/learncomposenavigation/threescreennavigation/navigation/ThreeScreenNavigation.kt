package com.kolu.learncomposenavigation.threescreennavigation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kolu.learncomposenavigation.threescreennavigation.screens.ScreenA
import com.kolu.learncomposenavigation.threescreennavigation.screens.ScreenB
import com.kolu.learncomposenavigation.threescreennavigation.screens.ScreenC

@Composable
fun ThreeScreenNavigation(
    modifier: Modifier = Modifier.fillMaxSize(),
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ThreeScreenNavScreens.ScreenA,
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        composable<ThreeScreenNavScreens.ScreenA> { ScreenA(navController = navController) }
        composable<ThreeScreenNavScreens.ScreenB> { ScreenB(navController = navController) }
        composable<ThreeScreenNavScreens.ScreenC> { ScreenC(navController = navController) }
    }
}