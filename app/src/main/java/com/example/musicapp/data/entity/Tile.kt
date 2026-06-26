package com.example.musicapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.musicapp.R
import com.example.musicapp.model.TileColor
import java.util.UUID

@Entity(tableName = "sounds")
data class Tile(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val kitId: String = "default",
    val index: Int = 0,
    val sound: Int = R.raw.kick_808,
    val color: TileColor = TileColor.orange(),
    val icon: Int = R.drawable.drum_icon,
    val onLoop: Boolean = false,
)
