package com.curso.android.modulo5

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class LoginViewModel : ViewModel() {

    private val _loginStatus = MutableLiveData<String>()
    val loginStatus: LiveData<String> get() = _loginStatus

    fun validarCredenciales(email: String, pass: String) {
        when {
            email.isEmpty() || pass.isEmpty() -> {
                _loginStatus.value = "Error: Los campos no pueden estar vacíos"
            }
            !email.contains("@") -> {
                _loginStatus.value = "Error: Formato de correo inválido"
            }
            pass.length < 6 -> {
                _loginStatus.value = "Error: La contraseña debe tener al menos 6 caracteres"
            }
            else -> {
                _loginStatus.value = "¡Éxito!: Validaciones aprobadas"
            }
        }
    }
}
