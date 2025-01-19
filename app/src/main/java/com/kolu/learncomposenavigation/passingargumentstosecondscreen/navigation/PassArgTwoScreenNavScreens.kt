package com.kolu.learncomposenavigation.passingargumentstosecondscreen.navigation

import kotlinx.serialization.Serializable

sealed interface PassArgTwoScreenNavScreens {
    @Serializable
    data object ScreenA: PassArgTwoScreenNavScreens

    @Serializable
    data class ScreenB(
        var screenAdata1: String = "",
        var screenAdata2: Int = 0
    ): PassArgTwoScreenNavScreens
}