package com.example.aula26fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val nome = "Teste" + this.javaClass.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(nome,"onCreate")


        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.containerFragmentPrimario, FragmentoPrimario())
        fragmentTransaction.add(R.id.containerFragmentSecundario, FragmentoSecundario())
        fragmentTransaction.add(R.id.containerFragmentTerciarioMenu,FragmentoTerciarioMenu())
        fragmentTransaction.commit()

    }

    override fun onStart() {
        super.onStart()
        Log.i(nome,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(nome,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(nome,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(nome,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(nome,"onDestroy")
    }

}