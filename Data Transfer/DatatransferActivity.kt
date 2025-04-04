package com.example.unit3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DatatransferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datatransfer)

        val fragManager: androidx.fragment.app.FragmentManager = supportFragmentManager
        val change1: androidx.fragment.app.FragmentTransaction= fragManager.beginTransaction()
        change1.replace(R.id.fragleft, leftfrag())
        change1.commit()

        val fragManager2: androidx.fragment.app.FragmentManager = supportFragmentManager
        val change2: androidx.fragment.app.FragmentTransaction= fragManager2.beginTransaction()
        change2.replace(R.id.fragright, rightfrag())
        change2.commit()
    }
}