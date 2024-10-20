package com.ysuhuailas.angela.usolayoutsv4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val tvNombreCliente = findViewById<TextView>(R.id.tvNombreClientePedido)
        val tvNumeroCliente = findViewById<TextView>(R.id.tvNumeroClientePedido)
        val tvProductos = findViewById<TextView>(R.id.tvProductosPedido)
        val tvUbicacion = findViewById<TextView>(R.id.tvUbicacionPedido)

        val nombre = intent.getStringExtra("nombre")
        val numero = intent.getStringExtra("numero")
        val productos = intent.getStringExtra("productos")
        val ubicacion = intent.getStringExtra("direccion")

        tvNombreCliente.text = nombre
        tvNumeroCliente.text = numero
        tvProductos.text = productos
        tvUbicacion.text = ubicacion

        val btnLlamar = findViewById<Button>(R.id.btnLlamar)
        btnLlamar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$numero")
            startActivity(intent)
        }

        val btnWhatsApp = findViewById<Button>(R.id.btnWsp)
        btnWhatsApp.setOnClickListener {
            val mensaje = "Hola $nombre, tus productos: $productos están en camino a la dirección: $ubicacion."
            val uri = Uri.parse("https://wa.me/?text=$mensaje")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        val btnMaps = findViewById<Button>(R.id.btnMaps)
        btnMaps.setOnClickListener {
            val uri = Uri.parse("geo:0,0?q=$ubicacion")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}