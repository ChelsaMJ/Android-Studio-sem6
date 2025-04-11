package com.example.unit4

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.E

class SharedpreferencesActivity : AppCompatActivity() {

    lateinit var sharedPreferences1: SharedPreferences
    lateinit var name: TextView
    lateinit var email: TextView
    val mypreference = "mypref"
    val Name = "nameKey"
    val Email = "emailKey"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sharedpreferences)

        name = findViewById(R.id.etname)
        email = findViewById(R.id.etemail)

        sharedPreferences1 = getSharedPreferences(mypreference, Context.MODE_PRIVATE)
        name.text = sharedPreferences1.getString(Name, "")
        email.text = sharedPreferences1.getString(Email, "")

    }

    fun save(view: View?){
        val n= name.text.toString()
        val e = email.text.toString()

        val editor = sharedPreferences1.edit()

        editor.putString(Name, n)
        editor.putString(Email,e)
        editor.apply()
    }

    fun clear(view: View?){
        name.text = ""
        email.text = ""
    }

    fun get(view: View?){
        sharedPreferences1 = getSharedPreferences(mypreference, Context.MODE_PRIVATE)
        name.text = sharedPreferences1.getString(Name, "")
        email.text = sharedPreferences1.getString(Email, "")
    }

}