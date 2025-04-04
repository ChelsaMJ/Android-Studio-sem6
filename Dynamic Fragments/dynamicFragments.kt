package com.example.unit3

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class dynamicFragments : AppCompatActivity() {
    private var isFragment = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dynamic_fragments)

        val button = findViewById<Button>(R.id.btnfrag)

        // Load the initial fragment
        loadFragment(frag1())

        button.setOnClickListener {
            if (isFragment) {
                loadFragment(frag2())
            } else {
                loadFragment(frag1())
            }
            isFragment = !isFragment
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val fragManager = supportFragmentManager
        val transaction = fragManager.beginTransaction()
        transaction.replace(R.id.fragContainer, fragment)
        transaction.commit()
    }
}
