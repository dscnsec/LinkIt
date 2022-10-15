package com.dscnsec.linkit

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.compose.rememberNavController
import com.dscnsec.linkit.screens.NavigationGraph
import com.dscnsec.linkit.ui.theme.LinkItTheme
import com.dscnsec.linkit.utils.Screen
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalAnimationApi
@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LinkItTheme() {
                val navController = rememberNavController()
                NavigationGraph(navController = navController, startDestination = Screen.Welcome.route)
            }
        }
    }
}