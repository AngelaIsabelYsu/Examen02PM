package com.ysuhuailas.angela.usolayoutsv4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnOcultar = findViewById<Button>(R.id.btnOcultar)
        val viewVerde = findViewById<View>(R.id.viewVerde)

        btnMostrar.setOnClickListener {
            viewVerde.visibility = View.VISIBLE
        }

        btnOcultar.setOnClickListener {
            viewVerde.visibility = View.GONE
        }
    }
}