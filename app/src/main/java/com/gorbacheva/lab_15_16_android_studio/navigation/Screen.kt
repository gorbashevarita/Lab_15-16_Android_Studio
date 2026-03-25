package com.gorbacheva.lab_15_16_android_studio.navigation

import javax.security.auth.Subject

sealed class Screen(val route: String) {
    object  Home: Screen("home")
    object  Details : Screen("details/{subjectId}") {
        fun createRoute(subjectId: String) = "details/$subjectId"
    }
    object Profile : Screen("profile")
    object Settings : Screen("settings")
}