package com.example.cliente

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cliente.data.entities.ClienteEntiti
import com.example.cliente.domain.repository.ClienteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class clientesViewModel @Inject constructor(
    private val cliente: ClienteRepository
):ViewModel() {
    var nombre by mutableStateOf("")
    fun save() {
        viewModelScope.launch {
            cliente.save(cliente = ClienteEntiti(Nombre = nombre))
        }
    }
}