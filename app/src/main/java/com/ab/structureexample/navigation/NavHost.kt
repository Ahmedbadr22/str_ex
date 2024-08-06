package com.ab.structureexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ab.splash.SPLASH_SCREEN_ROUTE
import com.ab.splash.splashScreenNavComposable

@Composable
fun AppNavHost() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = SPLASH_SCREEN_ROUTE) {
        splashScreenNavComposable()
    }
}