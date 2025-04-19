package com.example.unit4

import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.IOException

class EmployeeDeets : AppCompatActivity() {

    private lateinit var etEmployeeName: EditText
    private lateinit var etID : EditText
    private lateinit var etQualification : EditText
    private lateinit var etGender : EditText
    private lateinit var etJoinDate : EditText

    private val filename = "employee_details.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_employee_deets)

        etEmployeeName = findViewById(R.id.etname)
        etID = findViewById(R.id.etid)
        etQualification = findViewById(R.id.etqualification)
        etGender = findViewById(R.id.etgender)
        etJoinDate = findViewById(R.id.etjoin)


        val btnsubmit = findViewById<Button>(R.id.btnsubmit)
        val btnfetch = findViewById<Button>(R.id.btnfetch)
        val btnclear = findViewById<Button>(R.id.btnclear)

        btnsubmit.setOnClickListener { submit() }
        btnfetch.setOnClickListener { fetch() }
        btnclear.setOnClickListener { clearfields() }
    }

    private fun submit(){
        val name = etEmployeeName.text.toString()
        val id = etID.text.toString()
        val qual = etQualification.text.toString()
        val gend = etGender.text.toString()
        val join = etJoinDate.text.toString()


        if( name.isEmpty() || id.isEmpty() || qual.isEmpty() || gend.isEmpty()|| join.isEmpty()){
            Toast.makeText(this, "Please fill all deets", Toast.LENGTH_LONG).show()
            return
        }
        val data = "$name\n$id\n$qual\n$gend\n$join"
        try {
            openFileOutput(filename, MODE_PRIVATE).use {
                it.write(data.toByteArray())
            }
            Toast.makeText(this, "deets saved to internal storage", Toast.LENGTH_SHORT).show()
        } catch (e:IOException){
            e.printStackTrace()
            Toast.makeText(this,"Error saving deets",Toast.LENGTH_SHORT).show()
        }
    }

    private fun fetch(){
        openFileInput(filename).use { stream ->
            val lines = stream.bufferedReader().readLines()
            if(lines.size >=2){
                etEmployeeName.setText(lines[0])
                etID.setText(lines[1])
                etQualification.setText(lines[2])
                etGender.setText(lines[3])
                etJoinDate.setText(lines[4])

                Toast.makeText(this, "deets loaded", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "No data to load", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun clearfields(){
        etEmployeeName.setText("")
        etID.setText("")
        etQualification.setText("")
        etGender.setText("")
        etJoinDate.setText("")
    }
}