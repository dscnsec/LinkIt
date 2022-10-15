package com.dscnsec.linkit.utils

import com.dscnsec.linkit.R

sealed class BottomNavItem( var icon : Int, var screen_route:String) {

    object Dashboard : BottomNavItem( R.raw.home, "dashboard")
    object QrScan : BottomNavItem(R.raw.qr, "qr_scan")
    object Profile : BottomNavItem(R.raw.profile, "profile")
}