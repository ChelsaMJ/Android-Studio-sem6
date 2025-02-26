package com.example.shoppingapp

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ratingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_bar)

        val rat = findViewById<RatingBar>(R.id.rat)
        val textView = findViewById<TextView>(R.id.text1)

        rat.setOnRatingBarChangeListener { _, f1, _ -> textView.text = "Your rating is $f1" }
//        rat.setOnRatingBarChangeListener { _, f1, _ -> textView.text = f1.toString() }
    }
}
