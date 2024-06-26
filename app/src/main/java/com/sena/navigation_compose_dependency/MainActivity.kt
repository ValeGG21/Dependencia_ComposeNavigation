package com.sena.navigation_compose_dependency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sena.navigation_compose_dependency.Navigation_Controller.NavComponent
import com.sena.navigation_compose_dependency.ui.theme.Navigation_Compose_DependencyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navigation_Compose_DependencyTheme {
                NavComponent()
                }
            }
        }
    }
