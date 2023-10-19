package com.example.ejercicio2anthonyv

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private lateinit var Nombre:TextView

class Segunda_Actividad :  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_activity)

        Nombre = findViewById(R.id.Nombre)

        val recogeLogin = intent.getStringExtra("login")
        Nombre.text = "Hola " + recogeLogin
    }

}