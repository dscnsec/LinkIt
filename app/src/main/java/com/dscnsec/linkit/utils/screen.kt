package com.dscnsec.linkit.utils

sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
    object Home : Screen(route = "home_screen")
}