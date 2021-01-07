package com.example.jetpackcompose1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose1.ui.shapes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumn (
                    modifier = Modifier
                    .fillMaxSize()
                    .background(
                    color = Color(0XFFf1dada)))
            {
                Image(bitmap = imageFromResource(res = resources, resId = R.drawable
                        .jetpackcompose_logo),
                        modifier = Modifier.height(300.dp),
                        contentScale = ContentScale.Crop, )
                Column(modifier = Modifier.padding(16.dp) )
                {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement =  Arrangement.SpaceBetween)
                    {
                        Text(
                        text = "jetPack Compos",
                        style = TextStyle(
                        color = Color(0xFFff884d),
                        fontSize = TextUnit.Companion.Sp(26)))
                        Text(
                        text = " Android Ui",
                        style = TextStyle(
                        color = Color(0xFF1a1aff),
                        fontSize = TextUnit.Companion.Sp(20)),
                        modifier = Modifier.align(Alignment.CenterVertically))
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                        Text(
                        text = "Kotlin",
                        style = TextStyle(
                        color = Color(0xFF660033),
                        fontSize = TextUnit.Companion.Sp(26)
                    ))
                        Spacer(modifier = Modifier.padding(top = 10.dp))
                    Button(
                            onClick = { },
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    {
                        Text(text = "READ ME")
                    }
                }
            }
        }


//        @Composable
//        fun NewsStory() {
//            Text("A day in Shark Fin Cove")
//            Text("Davenport, California")
//            Text("December 2018")
//        }
//
//        @Preview
//        @Composable
//        fun DefaultPreview() {
//            NewsStory()
//        }



    }
}
