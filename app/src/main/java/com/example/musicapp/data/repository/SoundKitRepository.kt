package com.example.musicapp.data.repository

import com.example.musicapp.data.dao.SoundKitDao
import com.example.musicapp.data.dao.TileDao
import com.example.musicapp.data.relation.SoundKitWithTiles
import com.example.musicapp.model.Tile
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow

class SoundKitRepository @Inject constructor(
    private val soundKitDao: SoundKitDao,
    private val tileDao: TileDao
){
    fun getKitWithTiles(kitId: String): Flow<SoundKitWithTiles?> = soundKitDao.getKitWithTiles(kitId)

    suspend fun updateTile(tile: Tile) =
        tileDao.updateTile(tile)

//    suspend fun initializeDefaultKits() {
//        if (soundKitDao.getDefaultKitsCount() == 0) {
//            createDefaultKit()
//        }
//    }
}