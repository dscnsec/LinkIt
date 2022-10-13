package com.dscnsec.linkit.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.dscnsec.linkit.R
import com.dscnsec.linkit.mock.mockData
import com.dscnsec.linkit.utils.BottomNavItem


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen(data = mockData)
        }
        composable(BottomNavItem.QrScan.screen_route) {
            QrScreen()
        }
        composable(BottomNavItem.Profile.screen_route) {
            Profile(data = mockData)
        }
    }
}

@Composable
fun BottomNavigation(navController: NavController) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.QrScan,
        BottomNavItem.Profile,
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.btmNav),
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
                BottomNavigationItem(
                    icon = {
                        if (item.screen_route == "qr_scan"){
                            (Box(modifier = Modifier.clip(CircleShape).size(50.dp).background(color = Color.Black), contentAlignment = Alignment.Center) {
                                Icon(
                                    painterResource(id = item.icon),
                                    contentDescription = item.screen_route,
                                    tint = Color.White
                                )
                            })
                        }else{
                            Icon( painterResource(id =item.icon), contentDescription = item.screen_route, Modifier.size(28.dp))
                        }
                         },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White.copy(0.4f),
                    alwaysShowLabel = true,
                    selected = currentRoute == item.screen_route,
                    onClick = {
                        navController.navigate(item.screen_route) {

                            navController.graph.startDestinationRoute?.let { screen_route ->
                                popUpTo(screen_route) {
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
        }
    }
}