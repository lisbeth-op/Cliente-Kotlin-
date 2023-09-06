package com.example.cliente.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Clientes")
    data class ClienteEntiti(
        @PrimaryKey
        val ClienteId:Int?=null,
        var Nombre: String=""

)