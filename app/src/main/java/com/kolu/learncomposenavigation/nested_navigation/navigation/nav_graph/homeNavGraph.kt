package com.kolu.learncomposenavigation.nested_navigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kolu.learncomposenavigation.nested_navigation.navigation.NestedNavigationGroup
import com.kolu.learncomposenavigation.nested_navigation.screens.home_screens.DetailsComp
import com.kolu.learncomposenavigation.nested_navigation.screens.home_screens.HomeComp

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    navigation<NestedNavigationGroup.HomeNavigationGroup>(
        startDestination = NestedNavigationGroup.HomeNavigationGroup.HomeScreen(username = "N/A")
    ){
        composable<NestedNavigationGroup.HomeNavigationGroup.HomeScreen> { HomeComp() }
        composable<NestedNavigationGroup.HomeNavigationGroup.DetailsScreen> { DetailsComp() }
    }
}