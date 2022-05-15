package com.example.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculateNumbers:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculateNumbers=findViewById(R.id.btnCalculateNumbers)
        btnCalculateNumbers.setOnClickListener {
            val intent =Intent(this,CalculateNumbersActivity::class.java)
            startActivity(intent)
        }

    }
}