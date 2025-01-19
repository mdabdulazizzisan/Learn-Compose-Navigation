package com.kolu.learncomposenavigation.passingargumentstosecondscreen.navigation


import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kolu.learncomposenavigation.passingargumentstosecondscreen.screens.ScreenA
import com.kolu.learncomposenavigation.passingargumentstosecondscreen.screens.ScreenB

@Composable
fun PassArgTwoScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = PassArgTwoScreenNavScreens.ScreenA,
        contentAlignment = Alignment.Center

    ){
        composable<PassArgTwoScreenNavScreens.ScreenA> {
            ScreenA(navController = navController)
        }
        composable<PassArgTwoScreenNavScreens.ScreenB> {
            ScreenB(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun test() {
    PassArgTwoScreen(
        navController = rememberNavController()
    )
}
