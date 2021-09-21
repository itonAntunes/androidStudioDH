package com.example.aula26fragmentos

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentoTerciarioMenu : Fragment() {

    val nome = "Teste" + this.javaClass.name

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(nome,"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(nome,"onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.i(nome,"onCreate")
        return inflater.inflate(R.layout.fragment_fragmento_terciario_menu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(nome,"onViewCreated")
    }
    override fun onStart(){
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

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(nome,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(nome,"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(nome,"onDetach")
    }

}