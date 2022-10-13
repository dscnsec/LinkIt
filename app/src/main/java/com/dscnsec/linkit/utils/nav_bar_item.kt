package com.dscnsec.linkit.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.dscnsec.linkit.R

sealed class BottomNavItem( var icon : Int, var screen_route:String) {

    object Home : BottomNavItem( R.raw.home, "home")
    object QrScan : BottomNavItem(R.raw.qr, "qr_scan")
    object Profile : BottomNavItem(R.raw.profile, "profile")
}