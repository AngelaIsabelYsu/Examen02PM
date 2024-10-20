package com.ysuhuailas.angela.usolayoutsv4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistroPedidosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_pedidos)

        val etNombreCliente = findViewById<EditText>(R.id.etNombreCliente)
        val etNumeroCliente = findViewById<EditText>(R.id.etNumeroCliente)
        val etProductos = findViewById<EditText>(R.id.etProductos)
        val etCiudad = findViewById<EditText>(R.id.etCiudad)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)

        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        btnRegistrar.setOnClickListener {
            val intent = Intent(this, PedidoActivity::class.java)
            intent.putExtra("nombre", etNombreCliente.text.toString())
            intent.putExtra("numero", etNumeroCliente.text.toString())
            intent.putExtra("productos", etProductos.text.toString())
            intent.putExtra("ciudad", etCiudad.text.toString())
            intent.putExtra("direccion", etDireccion.text.toString())
            startActivity(intent)
        }
    }
}