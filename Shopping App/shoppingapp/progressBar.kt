package com.example.shoppingapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class progressBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progress_bar)

        val progress = findViewById<ProgressBar>(R.id.prg)
        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            progress.visibility = View.VISIBLE

            button.isEnabled=false
        }

    }
}