package com.example.musicapp.model

import androidx.compose.ui.graphics.Color
import com.example.musicapp.ui.theme.blue
import com.example.musicapp.ui.theme.blueBorder
import com.example.musicapp.ui.theme.blueLight
import com.example.musicapp.ui.theme.green
import com.example.musicapp.ui.theme.greenBorder
import com.example.musicapp.ui.theme.greenLight
import com.example.musicapp.ui.theme.orange
import com.example.musicapp.ui.theme.orangeBorder
import com.example.musicapp.ui.theme.orangeLight
import com.example.musicapp.ui.theme.pink
import com.example.musicapp.ui.theme.pinkBorder
import com.example.musicapp.ui.theme.pinkLight
import com.example.musicapp.ui.theme.purple
import com.example.musicapp.ui.theme.purpleBorder
import com.example.musicapp.ui.theme.purpleLight
import com.example.musicapp.ui.theme.yellow
import com.example.musicapp.ui.theme.yellowBorder
import com.example.musicapp.ui.theme.yellowLight

data class TileColor(
    val main: Color = orange,
    val border: Color = orangeBorder,
    val light: Color = orangeLight,
) {
    companion object {
        fun orange() = TileColor(
            main = orange,
            border = orangeBorder,
            light = orangeLight
        )
        fun green() = TileColor(
            main = green,
            border = greenBorder,
            light = greenLight
        )
        fun blue() = TileColor(
            main = blue,
            border = blueBorder,
            light = blueLight
        )
        fun yellow() = TileColor(
            main = yellow,
            border = yellowBorder,
            light = yellowLight
        )
        fun pink() = TileColor(
            main = pink,
            border = pinkBorder,
            light = pinkLight
        )
        fun purple() = TileColor(
            main = purple,
            border = purpleBorder,
            light = purpleLight
        )
    }
}
