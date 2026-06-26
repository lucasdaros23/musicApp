package com.example.musicapp.feature.main

import com.example.musicapp.R
import com.example.musicapp.data.entity.Tile
import com.example.musicapp.model.TileColor
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

val listOfTiles = listOf(
    Tile(color = TileColor.orange(), index = 0),
    Tile(color = TileColor.green(), sound = R.raw.hihat_808, index = 1),
    Tile(color = TileColor.blue(), sound = R.raw.clap_808, index = 2),
    Tile(color = TileColor.yellow(), index = 3),
    Tile(color = TileColor.pink(), index = 4),
    Tile(color = TileColor.purple(), index = 5),
)

val listOfSidebarButtons = listOf(
    R.drawable.edit_icon to {},
    R.drawable.metronome_icon to {},
    R.drawable.record_icon to {},
)