package com.example.musicapp.feature.edit

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.musicapp.R
import com.example.musicapp.feature.components.TileIcon
import com.example.musicapp.ui.theme.Size
import com.example.musicapp.ui.theme.blue
import com.example.musicapp.ui.theme.blueBorder
import com.example.musicapp.ui.theme.blueLight
import com.example.musicapp.ui.theme.green
import com.example.musicapp.ui.theme.greenBorder
import com.example.musicapp.ui.theme.greenLight
import com.example.musicapp.ui.theme.orange
import com.example.musicapp.ui.theme.orangeBorder
import com.example.musicapp.ui.theme.orangeLight
import com.example.musicapp.ui.theme.uiBlueLight
import com.example.musicapp.ui.theme.yellow
import com.example.musicapp.ui.theme.yellowBorder
import com.example.musicapp.ui.theme.yellowLight

@Composable
fun EditScreen() {
    Column(
        Modifier
            .fillMaxHeight()
            .padding(Size.mini)
    ) {
        Row(
            Modifier.fillMaxWidth()
        ) {
            Text(
                text = "x",
                color = uiBlueLight,
                fontSize = 40.sp
            )
        }
        ListItem(Triple(orange, orangeLight, orangeBorder))
        ListItem(Triple(blue, blueLight, blueBorder))
        ListItem(Triple(yellow, yellowLight, yellowBorder))
        ListItem(Triple(green, greenLight, greenBorder))
    }
}

@Composable
private fun ListItem(
    colors: Triple<Color, Color, Color>
) {
    val shape = RoundedCornerShape(size = Size.tiny)
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(colors.first, shape)
                .height(Size.xlarge)
                .border(
                    width = Size.micro,
                    color = colors.third,
                    shape = shape
                ),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Spacer(Modifier.size(Size.tiny))
            TileIcon(
                id = R.drawable.drum_icon,
                backgroundColor = colors.second,
                iconColor = colors.first,
                size = Size.regular
            )
        }
        Spacer(Modifier.size(Size.mini))
    }
}

@Preview(showBackground = true, device = "spec:width=640dp,height=360dp,orientation=landscape")
@Composable
private fun EditScreenPreview() {
    EditScreen()
}