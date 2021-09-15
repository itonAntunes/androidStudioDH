package com.example.aula01primeiroappex02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    
    private lateinit var tvEmailRecebido: TextView
    private lateinit var tvSenhaRecebido: TextView
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        
        tvEmailRecebido = findViewById(R.id.tv_email_recebido)
        tvSenhaRecebido = findViewById(R.id.tv_senha_recebido)
        
        val bundle = intent.getBundleExtra("bundle")
        tvEmailRecebido.text = bundle?.getString("email")
        // tvSenhaRecebido.text = bundle?.getString("senha")

    }
}