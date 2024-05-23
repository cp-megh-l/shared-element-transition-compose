package com.example.sharedelementtransitionsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.sharedelementtransitionsample.ui.screen.shoes.ShoesHomeView
import com.example.sharedelementtransitionsample.ui.theme.SharedElementTransitionSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SharedElementTransitionSampleTheme {
                ShoesHomeView()
            }
        }
    }
}