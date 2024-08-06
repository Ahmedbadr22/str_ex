package com.ab.splash

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val SPLASH_SCREEN_ROUTE = "splash_screen_route"

fun NavGraphBuilder.splashScreenNavComposable() {

    composable(route = SPLASH_SCREEN_ROUTE) {
        SplashScreen()
    }
}


fun NavHostController.navigateToSplashScreen() {
    navigate(SPLASH_SCREEN_ROUTE) {
        popUpTo("splash") {
            inclusive = true
        }
    }
}