package com.example.week05assignment

import android.os.Build
import android.os.Bundle
import android.view.WindowInsetsController
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.week05assignment.ui.theme.MylecdTheme
import com.example.week05assignment.uiComponents.MainScreen

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            MylecdTheme {
                Scaffold(modifier = Modifier.fillMaxSize().background(Color.White)) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding),

                    )
                }
            }
        }
    }
}

