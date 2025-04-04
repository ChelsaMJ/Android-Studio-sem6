package com.example.unit3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import org.w3c.dom.Text

class rightfrag: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.rightfrag, container, false)
        view.findViewById<View>(R.id.btnrightfrag).setOnClickListener {
//            val inputData = view.findViewById<TextView>(R.id.textrightfrag).text.toString()
            val fragmentA = parentFragmentManager.findFragmentById(R.id.fragleft) as leftfrag
            fragmentA.receiveData("Bow")
        }
        return view


    }

    fun receiveData(inputData: String) {
        view?.findViewById<TextView>(R.id.textrightfrag)?.text = inputData
    }
}