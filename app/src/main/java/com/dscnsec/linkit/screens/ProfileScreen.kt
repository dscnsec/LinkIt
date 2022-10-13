package com.dscnsec.linkit.screens


import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dscnsec.linkit.utils.OnBoardingPage
import coil.compose.rememberAsyncImagePainter
import com.dscnsec.linkit.mock.mockData
import com.dscnsec.linkit.models.User
import com.dscnsec.linkit.R

@Composable
fun Profile(data : User){
    Column( modifier = Modifier
        .fillMaxSize()
        .padding(vertical = 31.dp) , horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = rememberAsyncImagePainter(data.profileImage!!),
            contentDescription = "profile image",
            modifier = Modifier
                .clip(CircleShape)
                .height(140.dp)
                .width(136.dp),
        )
        Spacer(modifier = Modifier.height(15.dp))
        data.name?.let { Text(text = it, fontSize = 30.sp, fontWeight = FontWeight(400)) }
        Spacer(modifier = Modifier.height(15.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .padding(horizontal = 20.dp)
            .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
            .background(Color.Black)){
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .padding(2.dp)
                .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
                .background(Color.White)){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(500.dp)
                        .padding(26.dp)
                        .clip(RoundedCornerShape(corner = CornerSize(20.dp)))
                ) {
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(4)
                    ) {
                        data.links?.let {
                            items(it.size) {
                                Box(
                                    modifier = Modifier
                                        .height(80.dp)
                                        .width(60.dp)
                                        .padding(10.dp)
                                ) {
                                    val context = LocalContext.current
                                    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse(data.links!![it].link)) }
                                    Image(painter = rememberAsyncImagePainter(data.links!![it].image), contentDescription = "icon",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clip(RoundedCornerShape(corner = CornerSize(20.dp))).clickable {  context.startActivity(intent)  },
                                        contentScale = ContentScale.FillBounds
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


