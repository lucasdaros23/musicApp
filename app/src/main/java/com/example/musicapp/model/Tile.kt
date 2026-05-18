package com.example.musicapp.model

import androidx.compose.ui.graphics.Color
import com.example.musicapp.R
import com.example.musicapp.ui.theme.orange
import com.example.musicapp.ui.theme.orangeBorder
import com.example.musicapp.ui.theme.orangeLight

data class Tile(
    val color: Color = orange,
    val border: Color = orangeBorder,
    val lightColor: Color = orangeLight,
    val onLoop: Boolean = false,
    val icon: Int = R.drawable.drum_icon
)