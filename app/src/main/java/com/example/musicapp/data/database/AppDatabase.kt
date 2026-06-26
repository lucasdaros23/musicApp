package com.example.musicapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.musicapp.data.dao.SoundKitDao
import com.example.musicapp.data.dao.TileDao
import com.example.musicapp.data.entity.SoundKit
import com.example.musicapp.data.entity.Tile

@Database(entities = [SoundKit::class, Tile::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
        abstract fun soundKitDao(): SoundKitDao
        abstract fun tileDao(): TileDao
}