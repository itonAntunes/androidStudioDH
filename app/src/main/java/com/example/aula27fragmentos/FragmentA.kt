package com.example.aula27fragmentos

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import java.lang.RuntimeException


class FragmentA : Fragment() {

    private lateinit var  botao: Button
    private lateinit var editText: EditText
    private var listener: FragmentA.IFragmentAListener? = null

    interface IFragmentAListener{

        fun enviarDadosA(dados: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(context is IFragmentAListener){
            listener = context
        }else{
            throw RuntimeException(context.toString() + "FragmentAListener não implementado")
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_a, container, false)
        val view: View = inflater.inflate(R.layout.fragment_a, container, false)
        botao = view.findViewById(R.id.bt_fragment_a)
        editText = view.findViewById(R.id.et_fragment_a)

        botao.setOnClickListener {
            listener?.enviarDadosA(editText.text.toString())
        }
        return view
    }

    fun atualizaA(dados: String){
        editText.setText(dados)
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}