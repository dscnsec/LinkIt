package com.dscnsec.linkit.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForwardIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dscnsec.linkit.mock.mockData
import com.dscnsec.linkit.models.User
import com.dscnsec.linkit.ui.theme.PrimaryColor
import com.dscnsec.linkit.widgets.WelcomeBanner

@Composable
fun DashboardScreen(
    data: User
) {
    Column( modifier = Modifier
        .fillMaxSize().background(color = Color.White)
        .padding(horizontal = 20.dp, vertical = 31.dp) , horizontalAlignment = Alignment.CenterHorizontally) {

        data.profileImage?.let {
            data.name?.let { it1 ->
                WelcomeBanner(
                    userImage = it,
                    userName = it1
                )
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
                .border(
                    border = BorderStroke(
                        2.dp,
                        color = Color.Black
                    ),
                    shape = RoundedCornerShape(corner = CornerSize(20.dp))
                )
                .padding(26.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally 
            ) {
                data.links?.let { DashboardItems(stats = it.size, itemName = "Links\nCreated") }
                Spacer(modifier = Modifier.height(20.dp))
                data.totalShared?.let { DashboardItems(stats = it, itemName = "Profiles\nShares") }
                Spacer(modifier = Modifier.height(20.dp))
                data.friends?.let { DashboardItems(stats = it.size, itemName = "Friends\nAdded") }
            }
        }
    }
}

@Composable
fun DashboardItems(
    stats: Int,
    itemName : String,
){
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(
            modifier= Modifier
                .size(80.dp)
                .clip(CircleShape)
                .border(
                    border = BorderStroke(
                        3.dp,
                        color = PrimaryColor
                    ),
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ){
            Text(stats.toString(), fontSize = 40.sp)
        }
        Text(itemName, fontSize= 30.sp, color= PrimaryColor)
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Rounded.ArrowForwardIos,
                contentDescription = "Arrow icon",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview() {
    DashboardScreen(data = mockData)
}