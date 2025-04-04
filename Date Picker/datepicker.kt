package com.example.unit3

import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class datepicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datepicker)

        val datepicker = findViewById<DatePicker>(R.id.dp)
        val btndp = findViewById<Button>(R.id.btndp)
        val textdp = findViewById<TextView>(R.id.text)
        val cal = Calendar.getInstance()
        val year = cal.get((Calendar.YEAR))
        val month = cal.get((Calendar.YEAR))
        val day = cal.get((Calendar.DAY_OF_MONTH))

        datepicker.init(year, month, day, null)
        btndp.setOnClickListener {
            val selectedyear = datepicker.year
            val selectedmonth = datepicker.month+1
            val selectedday= datepicker.dayOfMonth
            textdp.text = "Date: $selectedday/$selectedmonth/$selectedyear"
        }

    }
}