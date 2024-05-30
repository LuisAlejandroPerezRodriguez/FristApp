package com.PUCMM.luisapp.firstApp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.PUCMM.luisapp.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //All code here
        val resultado = findViewById<TextView>(R.id.result)
        val boton = findViewById<AppCompatButton>(R.id.btn)
        val nombre: String? = intent.extras?.getString("User_Name").orEmpty()

        resultado.text = "Hi $nombre 😁✌️"

        boton.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}