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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicapp.R
import com.example.musicapp.feature.components.IconComponent
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
import com.example.musicapp.ui.theme.pink
import com.example.musicapp.ui.theme.pinkBorder
import com.example.musicapp.ui.theme.pinkLight
import com.example.musicapp.ui.theme.uiBlueLight
import com.example.musicapp.ui.theme.yellow
import com.example.musicapp.ui.theme.yellowBorder
import com.example.musicapp.ui.theme.yellowLight

@Composable
fun EditScreen(modifier: Modifier) {
    Column(
        modifier
            .fillMaxHeight()
            .padding(Size.mini)
    ) {
        Row(
            Modifier.fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconComponent(
                id = R.drawable.close_icon,
                color = uiBlueLight,
                "",
                modifier= Modifier.size(Size.medium)
            )
            Spacer(Modifier.width(Size.regular))
            Text(
                "Escolha o Instrumento",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White.copy(alpha = .9f)
            )
        }

        LazyColumn() {
            item {
                ListItem(Triple(orange, orangeLight, orangeBorder), text = "Caixa")
                ListItem(Triple(blue, blueLight, blueBorder),"Prato")
                ListItem(Triple(yellow, yellowLight, yellowBorder), "Bumbo")
                ListItem(Triple(green, greenLight, greenBorder), "Triângulo")
                ListItem(Triple(pink, pinkLight, pinkBorder), "Conga")
            }
        }
    }
}

@Composable
private fun ListItem(
    colors: Triple<Color, Color, Color>,
    text: String,
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
                id = R.drawable.play_icon,
                backgroundColor = colors.second,
                iconColor = colors.first,
                size = Size.regular
            )
            Spacer(Modifier.size(Size.tiny))
            Text(
                text,
                fontSize = 20.sp,
                color = Color.White.copy(alpha = .9f),
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(Modifier.size(Size.mini))
    }
}

@Preview(showBackground = true, device = "spec:width=640dp,height=360dp,orientation=landscape")
@Composable
private fun EditScreenPreview() {
    EditScreen(Modifier)
}