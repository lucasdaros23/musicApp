package com.example.musicapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "sound_kits")
data class SoundKit(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
)
