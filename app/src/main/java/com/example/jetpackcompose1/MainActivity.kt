package com.example.jetpackcompose1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumn (
                    modifier = Modifier
                            .fillMaxSize()
                            .background(
                            color = Color(0XFFc65353)
                    )
            ) {
                Image(bitmap = imageFromResource(res = resources, resId = R.drawable
                        .jetpackcompose_logo),
                        modifier = Modifier.height(300.dp),//Size Image
                        contentScale = ContentScale.Crop,  //Size Image
                )
                Column(
                        modifier = Modifier.padding(16.dp),
                ) {
                    Text(
                    text = "jetPack Compos",
                    style = TextStyle(
                    color = Color(0xFFff884d),
                    fontSize = TextUnit.Companion.Sp(26)
                    ))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                    text = "Android Ui",
                    style = TextStyle(
                    color = Color(0xFF660033),
                    fontSize = TextUnit.Companion.Sp(26)
                    ))
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                    text = "By Kotlin",
                    style = TextStyle(
                    color = Color(0xFF1a1aff),
                    fontSize = TextUnit.Companion.Sp(26)
                    ))
                }
            }

        }
    }
}
