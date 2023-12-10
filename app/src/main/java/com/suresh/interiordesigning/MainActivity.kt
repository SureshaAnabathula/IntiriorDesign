package com.suresh.interiordesigning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.suresh.interiordesigning.app.InteriorApps

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InteriorApps()
        }
    }
}


@Preview
@Composable
fun DefaultPreview(){
    InteriorApps()
}