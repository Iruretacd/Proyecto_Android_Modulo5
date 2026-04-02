package com.curso.android.modulo5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.curso.android.modulo5.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inicializamos el ViewModel
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        // Observamos los cambios en el estado del login
        viewModel.loginStatus.observe(this) { mensaje ->
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        }

        // Lógica del botón (simulada para GitHub)
        // En un entorno real usaríamos ViewBinding aquí
    }
}
