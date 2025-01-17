package com.kolu.learncomposenavigation.basicnavigation.navigation

import kotlinx.serialization.Serializable

sealed interface BasicNavScreens {
    @Serializable
    data object ScreenA: BasicNavScreens
    @Serializable
    data object ScreenB: BasicNavScreens
}