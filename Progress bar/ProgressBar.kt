package com.example.toolbar2

import android.os.Bundle
import android.text.style.LineHeightSpan.WithDensity
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import android.widget.ProgressBar
import androidx.lifecycle.lifecycleScope
import java.lang.Boolean

class ProgressBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progress_bar)

        val progress=findViewById<ProgressBar>(R.id.progress)
        val btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            progress.visibility=View.VISIBLE
            btn1.isEnabled=false
        }

    }
}