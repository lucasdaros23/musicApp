package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.musicapp.feature.edit.EditScreen
import com.example.musicapp.feature.main.MainScreen
import com.example.musicapp.feature.main.MainViewModel
import com.example.musicapp.ui.theme.MusicAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val mainViewModel: MainViewModel = hiltViewModel()
//                    MainScreen(
//                        modifier = Modifier.padding(innerPadding),
//                        viewModel = mainViewModel
//                    )
                    EditScreen(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

