package com.example.shoppingapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class footer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_footer)

        val listname = findViewById<ListView>(R.id.list)
        val arr = arrayOf("very low", "low", "medium", "high", "very high", "more"
            ,"more","more","more","more","more","more","more","more","more","more",
            "more","more","more","more","more","more","more","more","more" )

        // connecting footer to list
        val listfooter = layoutInflater.inflate(R.layout.footer_list,listname, false) as ViewGroup
        listname.addFooterView(listfooter)

//        connecting arr with listview
        val conn = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
        listname.adapter = conn


    }
}