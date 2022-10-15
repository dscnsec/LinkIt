package com.dscnsec.linkit.utils

import androidx.annotation.DrawableRes
import com.dscnsec.linkit.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val isLoginPage: Boolean
) {
    object FirstPage : OnBoardingPage(
        image = R.drawable.first_page_image,
        title = "Too many links to handle?",
        isLoginPage = false
    )

    object SecondPage : OnBoardingPage(
        image = R.drawable.second_page_image,
        title = "We got you!",
        isLoginPage = false
    )

    object ThirdPage : OnBoardingPage(
        image = R.drawable.third_page_image,
        title = "Use LinkIt",
        isLoginPage = true
    )
}