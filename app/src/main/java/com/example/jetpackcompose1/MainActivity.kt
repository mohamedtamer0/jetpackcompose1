package com.example.jetpackcompose1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose1.ui.Jetpackcompose1Theme
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                    modifier = androidx.compose.ui.Modifier.padding(16.dp)
            ) {

                Text(text = "Hey Look Some Text")
                Spacer(modifier = androidx.compose.ui.Modifier.padding(top = 10.dp))
                Button(
                        onClick = { }
                ) {
                    Text(text = "A Button")
                }
            }
        }
    }
}
