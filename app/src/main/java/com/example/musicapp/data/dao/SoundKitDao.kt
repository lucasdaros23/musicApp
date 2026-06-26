package com.example.musicapp.data.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.musicapp.data.relation.SoundKitWithTiles
import kotlinx.coroutines.flow.Flow

@Dao
interface SoundKitDao {
    @Transaction
    @Query("SELECT * FROM sound_kits WHERE id = :kitId")
    fun getKitWithTiles(kitId: String): Flow<SoundKitWithTiles>
}