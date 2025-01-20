package com.kolu.learncomposenavigation.nested_navigation.navigation

import kotlinx.serialization.Serializable

sealed interface NestedNavigationGroup {

    @Serializable
    data object AuthScreen{
        @Serializable
        data object LoginScreen: NestedNavigationGroup
        @Serializable
        data object RegisterScreen: NestedNavigationGroup
        @Serializable
        data object ForgetPasswordScreen: NestedNavigationGroup
    }

    @Serializable
    data object HomeNavigationGroup{
        @Serializable
        data class HomeScreen(
            var username: String
        )
        @Serializable
        data object DetailsScreen
    }
}