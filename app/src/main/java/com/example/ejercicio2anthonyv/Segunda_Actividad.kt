package com.example.ejercicio2anthonyv

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class Segunda_Actividad :  AppCompatActivity() {

    private lateinit var Nombre:TextView
    override fun onCreate(savedInstanceState: Bundle?) {



        //hola1

        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_activity)

        Nombre = findViewById(R.id.Nombre)

        val recogeLogin = intent.getStringExtra("login")
        Nombre.text =  recogeLogin
    }

}