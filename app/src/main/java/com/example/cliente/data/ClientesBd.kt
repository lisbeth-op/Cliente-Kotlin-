package com.example.cliente.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cliente.data.dao.CllientesDao
import com.example.cliente.data.entities.ClienteEntiti

@Database(
    entities = [ClienteEntiti::class],
    version = 1
)
abstract class ClientesBd: RoomDatabase()  {
    abstract fun clientesDao(): CllientesDao

}