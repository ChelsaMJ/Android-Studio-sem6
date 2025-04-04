package com.example.unit3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment

class leftfrag: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.leftfrag, container, false)
        view.findViewById<View>(R.id.btnleftfrag).setOnClickListener {
            val inputData = view.findViewById<EditText>(R.id.editleftfrag).text.toString()
            val fragmentB = parentFragmentManager.findFragmentById(R.id.fragright) as rightfrag
            fragmentB.receiveData(inputData)
        }
        return view


    }

    fun receiveData(data: String) {
        view?.findViewById<EditText>(R.id.editleftfrag)?.setText(data)
    }
}