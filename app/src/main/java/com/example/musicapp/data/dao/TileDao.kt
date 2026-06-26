package com.example.musicapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.musicapp.model.Tile

@Dao
interface TileDao {
    @Insert
    suspend fun insertTiles(tiles: List<Tile>)

    @Update
    suspend fun updateTile(tile: Tile)

    @Query("delete from sounds where kitId = :kitId")
    suspend fun deleteTilesByKit(kitId: String)
}