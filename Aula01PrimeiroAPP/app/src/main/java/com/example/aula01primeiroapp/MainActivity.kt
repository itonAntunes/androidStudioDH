package com.example.aula01primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var tvNome: TextView
    private lateinit var tvEmail: TextView
    private lateinit var btnConfirmacao: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNome = findViewById(R.id.tv_nome)
        tvEmail = findViewById(R.id.tv_email)
        btnConfirmacao = findViewById(R.id.btn_confirmacao)

        btnConfirmacao.setOnClickListener{

            val intent = Intent(this,SegundaActivity::class.java)
            intent.putExtra("bundle",Bundle().apply {
                putString("nome",tvNome.text.toString())
                putString("email",tvEmail.text.toString())
                putInt("idade",24)
            })
            startActivity(intent)
        }
    }
}