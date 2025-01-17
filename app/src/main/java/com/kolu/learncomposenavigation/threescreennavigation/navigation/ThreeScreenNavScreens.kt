package com.kolu.learncomposenavigation.threescreennavigation.navigation

import kotlinx.serialization.Serializable

sealed interface ThreeScreenNavScreens {
    @Serializable
    data object ScreenA
    @Serializable
    data object ScreenB
    @Serializable
    data object ScreenC
}