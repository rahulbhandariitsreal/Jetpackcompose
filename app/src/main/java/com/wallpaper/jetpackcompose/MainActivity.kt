package com.wallpaper.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Setview(stringResource(id = R.string.title), 32)
        }
    }


    @Composable
    fun Setview(name: String, size: Int) {

        Column(
            Modifier
                .fillMaxSize()
                .background(Color(0xFF495E57)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ){

            Text(modifier=Modifier.padding(start = 20.dp,top=20.dp),
                text = name, fontSize = size.sp,
                color = Color(0xFFF4CE14)
            )
            Text(modifier=Modifier.padding(start = 20.dp),
              text=  stringResource(id = R.string.city), fontSize = size.sp,
                color = Color(0xFFFFFFFF)
            )
            Row(Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = { /*TODO*/
                                 Toast.makeText(applicationContext,"Compose achieved"
                                 ,Toast.LENGTH_LONG).show()}
                , border = BorderStroke(1.dp, Color.Red)
                , shape = RoundedCornerShape(10.dp)
                , colors = ButtonDefaults.buttonColors( Color.Gray)
                )
                {
                    Text (
                        text = stringResource(id =R.string.order),
                         color = Color(0xFFF4CE21),
                    fontStyle = FontStyle.Italic)
                  }
                Image(painter = painterResource(id = R.drawable.littlelem),
                    contentDescription = "Lemon", modifier = Modifier.height(100.dp))
            }
        }


    }



   @androidx.compose.ui.tooling.preview.Preview
    @Composable
    fun RestaurantNamePreview() {
            Setview(name = "Little Lemon", size = 32)

    }

}


