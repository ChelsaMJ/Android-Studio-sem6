package com.example.shoppingapp

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class customToast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_toast)

        val btn = findViewById<Button>(R.id.btn1)

        btn.setOnClickListener {
            val layout1 = layoutInflater.inflate(R.layout.support_toast,null)
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 0, 100)
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout1
            toast.show()

        }
    }
}