package com.kolu.learncomposenavigation.nested_navigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kolu.learncomposenavigation.nested_navigation.navigation.NestedNavigationGroup
import com.kolu.learncomposenavigation.nested_navigation.screens.auth_screens.ForgetPasswordComp
import com.kolu.learncomposenavigation.nested_navigation.screens.auth_screens.LoginComp
import com.kolu.learncomposenavigation.nested_navigation.screens.auth_screens.RegistrationComp


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation<NestedNavigationGroup.AuthScreen>(
        startDestination = NestedNavigationGroup.AuthScreen.LoginScreen,
    ){
        composable<NestedNavigationGroup.AuthScreen.LoginScreen> { LoginComp() }
        composable<NestedNavigationGroup.AuthScreen.RegisterScreen> { RegistrationComp() }
        composable<NestedNavigationGroup.AuthScreen.ForgetPasswordScreen> { ForgetPasswordComp() }
    }
}