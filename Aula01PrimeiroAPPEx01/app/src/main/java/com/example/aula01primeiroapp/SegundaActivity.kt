package com.example.aula01primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class SegundaActivity : AppCompatActivity() {

    private lateinit var tvNomeRecebido: TextView
    private lateinit var tvEmailRecebido: TextView
    private lateinit var tvIdadeRecebido: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        tvNomeRecebido = findViewById(R.id.tv_nome_recebido)
        tvEmailRecebido = findViewById(R.id.tv_email_recebido)
        tvIdadeRecebido = findViewById(R.id.tv_idade_recebida)

        val bundle = intent.getBundleExtra("bundle")
        tvNomeRecebido.text = bundle?.getString("nome")
        tvEmailRecebido.text = bundle?.getString("email")
        tvIdadeRecebido.text = bundle?.getInt("idade").toString()
    }
}