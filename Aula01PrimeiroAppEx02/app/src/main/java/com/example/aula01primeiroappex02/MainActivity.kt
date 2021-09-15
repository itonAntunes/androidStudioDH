package com.example.aula01primeiroappex02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var tvEmail: EditText
    private lateinit var tvSenha: EditText
    private lateinit var btnLoguin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvEmail = findViewById(R.id.tv_email_passado)
        tvSenha = findViewById(R.id.tv_senha_passada)
        btnLoguin = findViewById(R.id.btn_loguin)
        btnLoguin.setOnClickListener {
            validarCamposEmBranco()
        }
        btnLoguin.setOnClickListener {
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("bundle", Bundle().apply {
                putString("email", tvEmail.text.toString())
                putString("senha", tvSenha.text.toString())
            })
            startActivity(intent)
        }


    }

    private fun validarCamposEmBranco(): Boolean {
        var erro = false

        if (tvEmail.text.isEmpty()) {
            tvEmail.error = "Campo Obrigatorio"
            erro = true

        }
        if (tvSenha.text.isEmpty()) {
            tvSenha.error = "Campo Obrigatorio"
            erro = true
        }
        return erro
    }

}