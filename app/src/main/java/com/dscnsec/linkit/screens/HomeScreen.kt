@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.dscnsec.linkit.screens

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.dscnsec.linkit.utils.BottomNavItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) },
    ) {
        NavigationGraph(navController = navController, startDestination = BottomNavItem.Dashboard.screen_route)
    }
}