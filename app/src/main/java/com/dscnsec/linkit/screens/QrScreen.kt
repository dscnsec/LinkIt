package com.dscnsec.linkit.screens

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.rememberAsyncImagePainter
import com.dscnsec.linkit.R
import com.dscnsec.linkit.ui.theme.PrimaryColor
import com.google.zxing.WriterException

import com.journeyapps.barcodescanner.CaptureManager
import com.journeyapps.barcodescanner.CompoundBarcodeView
import com.journeyapps.barcodescanner.DecoratedBarcodeView



@Composable
fun QrScreen() {

//    AdminClubMembershipScanScreen( )
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White) , horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(65.dp))
        QrBox()
        Spacer(modifier = Modifier.height(75.dp))
        Button(
            modifier = Modifier.width(200.dp),
            onClick = { /*TODO*/ },
            shape= RoundedCornerShape(50),
            contentPadding = PaddingValues(vertical = 10.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                backgroundColor = PrimaryColor
            )
        ) {
            Text(text = "Share", fontSize = 25.sp)

        }
    }
}



@Composable
fun QrBox(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(400.dp)
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
                QrScanner()
            }
        }
    }
}

@Composable
fun QrScanner() {

    val context = LocalContext.current
    var scanFlag by remember {
        mutableStateOf(false)
    }

    val compoundBarcodeView = remember {
        CompoundBarcodeView(context).apply {
            val capture = CaptureManager(context as Activity, this)
            capture.initializeFromIntent(context.intent, null)
            this.setStatusText("")
            capture.decode()
            this.decodeContinuous { result ->
                if(scanFlag){
                    return@decodeContinuous
                }
                scanFlag = true
                result.text?.let { barCodeOrQr->
                    //Do something
                }
                scanFlag = false
            }
        }
    }



    AndroidView(
        modifier = Modifier,
        factory = { compoundBarcodeView },
    )
}
