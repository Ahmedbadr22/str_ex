package com.ab.structureexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ab.structureexample.navigation.AppNavHost
import com.ab.structureexample.ui.theme.StructureExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StructureExampleTheme {
                AppNavHost()
            }
        }
    }
}
