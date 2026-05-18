package com.example.musicapp.feature.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.R
import com.example.musicapp.ui.theme.Size
import com.example.musicapp.ui.theme.orange
import com.example.musicapp.ui.theme.orangeLight
import com.example.musicapp.ui.theme.uiBlue
import com.example.musicapp.ui.theme.uiBlueLight

@Composable
fun IconComponent(
    id: Int,
    color: Color,
    contentDescription: String,
    modifier: Modifier = Modifier,
) {
    Icon(
        painter = painterResource(id),
        contentDescription = contentDescription,
        tint = color,
        modifier = modifier
    )
}

@Composable
fun TileIcon(
    backgroundColor: Color,
    iconColor: Color,
    id: Int,
) {
    Box(
        modifier = Modifier
            .background(color = backgroundColor, shape = CircleShape)
            .size(Size.huge)
            .padding(Size.micro)
        ,
        contentAlignment = Alignment.Center
    ) {
        IconComponent(
            id = id,
            color = iconColor,
            contentDescription = "Icon",
        )
    }
}

@Composable
fun SidebarIconButton(
    id: Int,
    onclick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(color = uiBlue, shape = CircleShape)
            .size(Size.large)
            .padding(Size.mini)
            .aspectRatio(1f)
        ,
        contentAlignment = Alignment.Center
    ) {
        IconComponent(
            id = id,
            color = uiBlueLight,
            contentDescription = "Icon",
            modifier = Modifier.size(Size.large)
        )
    }
}

@Preview
@Composable
private fun SidebarIconButtonPreview() {
    SidebarIconButton(id = R.drawable.edit_icon, {})
}

@Preview
@Composable
private fun TileIconPreview() {
    TileIcon(
        backgroundColor = orangeLight,
        iconColor = orange,
        id = R.drawable.drum_icon,
    )
}