package com.PUCMM.luisapp.firstApp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.PUCMM.luisapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //All code here
        val boton = findViewById<AppCompatButton>(R.id.btn)
        val nombre = findViewById<AppCompatEditText>(R.id.UserName)
        boton.setOnClickListener {
            val name = nombre.text.toString()

            if (name.isNotEmpty()) {
                Log.i("Boton", "Se introdujo el nombre de:$name")
            }
            }
    }
}