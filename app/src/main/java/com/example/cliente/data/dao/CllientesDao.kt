package com.example.cliente.data.dao

import androidx.room.Insert
import androidx.room.Dao
import androidx.room.OnConflictStrategy
import com.example.cliente.data.entities.ClienteEntiti

@Dao
interface CllientesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(
        Clientes: ClienteEntiti
    )
}