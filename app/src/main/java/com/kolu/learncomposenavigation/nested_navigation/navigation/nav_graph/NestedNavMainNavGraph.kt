package com.kolu.learncomposenavigation.nested_navigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.kolu.learncomposenavigation.nested_navigation.navigation.NestedNavigationGroup

@Composable
fun NestedNavMainNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController) {

    NavHost(
        startDestination = NestedNavigationGroup.AuthScreen,
        navController =  navController
    ) {
        authNavGraph(navController = navController)
        homeNavGraph(navController = navController)
    }
}