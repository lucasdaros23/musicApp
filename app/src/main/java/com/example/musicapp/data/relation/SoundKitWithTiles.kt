package com.example.musicapp.data.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.musicapp.data.entity.SoundKit
import com.example.musicapp.data.entity.Tile

data class SoundKitWithTiles(
    @Embedded val kit: SoundKit,
    @Relation(
        parentColumn = "id",
        entityColumn = "kitId"
    )
    val tiles: List<Tile>
)
