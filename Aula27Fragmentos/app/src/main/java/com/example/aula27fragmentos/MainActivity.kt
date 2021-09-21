package com.example.aula27fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), FragmentA.IFragmentAListener, FragmentB.IFragmentBListener {

    private lateinit var fragmentA: FragmentA
    private lateinit var fragmentB: FragmentB


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragments()

    }

    private fun initFragments() {
        fragmentA = FragmentA()
        fragmentB = FragmentB()

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container_a, fragmentA)
        fragmentTransaction.replace(R.id.container_b, fragmentB)
        fragmentTransaction.commit()

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.container_a, fragmentA)
//            .replace(R.id.container_b, fragmentB)
//            .commit()
    }

    override fun enviarDadosA(dados: String) {
        fragmentB.atualizaB(dados)
    }

    override fun enviarDadosB(dados: String) {
        fragmentA.atualizaA(dados)
    }
}