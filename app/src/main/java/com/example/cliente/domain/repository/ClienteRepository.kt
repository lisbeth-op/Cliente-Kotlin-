package com.example.cliente.domain.repository

import com.example.cliente.data.ClientesBd
import com.example.cliente.data.entities.ClienteEntiti
import javax.inject.Inject


class ClienteRepository @Inject constructor(
    private val db:ClientesBd
)
 {
    suspend fun save(cliente: ClienteEntiti)=
        db.clientesDao().save(cliente)

}
