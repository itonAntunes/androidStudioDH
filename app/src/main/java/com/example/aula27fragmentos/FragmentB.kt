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

class FragmentB : Fragment() {

    private lateinit var  botao: Button
    private lateinit var editText: EditText
    private var listener: IFragmentBListener? = null

    interface IFragmentBListener{

        fun enviarDadosB(dados: String)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is IFragmentBListener){
            listener = context
        } else{
            throw RuntimeException(context.toString() + "FragmentBListenet não implementado")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_b, container, false)
        botao = view.findViewById(R.id.bt_fragment_b)
        editText = view.findViewById(R.id.et_fragment_b)

        botao.setOnClickListener {
            listener?.enviarDadosB(editText.text.toString())
        }
        return view
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    fun atualizaB(dados: String){
        editText.setText(dados)
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}