package com.dscnsec.linkit.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.dscnsec.linkit.ui.theme.PrimaryColor

@Composable
fun WelcomeBanner(
    userImage: String,
    userName: String
    ){
    Row(
       modifier=Modifier.fillMaxWidth(1f) ,
       horizontalArrangement = Arrangement.SpaceBetween,
       verticalAlignment = Alignment.CenterVertically,
    ){
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "Hi,", fontSize = 40.sp, color = PrimaryColor)
            Text(text = userName, fontSize= 40.sp, color= Color.Black)
        }
        Image(
            modifier = Modifier
                .size(120.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.FillBounds,
            painter = rememberAsyncImagePainter(userImage),
            contentDescription= "Profile Image")

    }

}

@Composable
@Preview(showBackground=true)
fun WelcomeBannerPreview(){
    Column(
       modifier= Modifier.fillMaxSize(),
    ) {
       WelcomeBanner(
           userImage = "https://picsum.photos/200",
           userName = "Jonny"
       )
    }
}