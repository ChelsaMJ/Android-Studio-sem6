package com.example.unit3

import android.os.Bundle
import android.widget.Button
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unit3.R

class timepicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_timepicker)
        val timePicker = findViewById<TimePicker>(R.id.timepicker)
        val btn = findViewById<Button>(R.id.btntime)
        btn.setOnClickListener {
            val hour = timePicker.hour
            val min = timePicker.minute
            val selectedTime = String.format("%02d:%2d", hour, min)
            Toast.makeText(this, "Selected Time: $selectedTime", Toast.LENGTH_LONG).show()
        }
    }
}