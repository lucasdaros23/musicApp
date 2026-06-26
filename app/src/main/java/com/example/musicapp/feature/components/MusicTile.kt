package com.example.musicapp.feature.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.feature.main.listOfTiles
import com.example.musicapp.model.Tile
import com.example.musicapp.ui.theme.Size

@Composable
fun MusicTile(
    tile: Tile,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(size = Size.tiny)
    Box(
        Modifier
            .fillMaxSize()
            .padding(Size.mini)
            .border(
                width = Size.mini,
                color = tile.border,
                shape = shape
            )
            .background(color = tile.color, shape = shape)
            .combinedClickable(
                onClick = { onClick() },
                onLongClick = {}
            ),
        contentAlignment = Alignment.Center
    ) {
        TileIcon(
            backgroundColor = tile.lightColor,
            iconColor = tile.color,
            id = tile.icon,
            size = Size.huge
        )
    }
}

@Preview(heightDp = 160, widthDp = 280)
@Composable
private fun MusicTilePreview() {
    MusicTile(
        listOfTiles.first(),
        {}
    )
}