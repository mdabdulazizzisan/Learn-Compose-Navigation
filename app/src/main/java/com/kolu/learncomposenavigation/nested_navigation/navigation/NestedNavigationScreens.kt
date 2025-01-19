package com.kolu.learncomposenavigation.nested_navigation.navigation

import kotlinx.serialization.Serializable

sealed interface NestedNavigationGroup {

    @Serializable
    sealed interface AuthScreen{
        @Serializable
        data object LoginScreen: NestedNavigationGroup
        @Serializable
        data object RegisterScreen: NestedNavigationGroup
        @Serializable
        data object ForgetPasswordScreen: NestedNavigationGroup
    }

    @Serializable
    sealed interface HomeNavigationGroup{
        data class HomeScreen(
            var username: String
        )
        data object DetailsScreen
    }
}