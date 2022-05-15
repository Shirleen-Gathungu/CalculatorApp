package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextClock
import android.widget.TextView

class CalculateNumbersActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var etNumberOne: EditText
    lateinit var etNumberTwo: EditText
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_numbers)
        tvResult = findViewById(R.id.tvResult)

        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etNumberOne = findViewById(R.id.etNumberOne)
        etNumberTwo = findViewById(R.id.etNumberTwo)

        btnAdd.setOnClickListener {
            val numone=etNumberOne.text.toString()
            val numtwo=etNumberTwo.text.toString()
            if(numone.isBlank()){
                etNumberOne.setError("Enter a number")
                return@setOnClickListener
            }
            if(numtwo.isBlank()){
                etNumberTwo.setError("Enter a number")
                return@setOnClickListener

            }
            AddNumbers(numone.toInt(), numtwo.toDouble())



            btnSubtract.setOnClickListener {
                val numone=etNumberOne.text.toString()
                val numtwo=etNumberTwo.text.toString()
                if(numone.isBlank()){
                    etNumberOne.setError("Enter a number")
                    return@setOnClickListener
                }
                if (numtwo.isBlank()) {
                    etNumberTwo.setError("Enter a number")
                    return@setOnClickListener
                }

                subtractNumbers(numone.toInt(), numtwo.toDouble())


                btnMultiply.setOnClickListener {
                    val numone=etNumberOne.text.toString()
                    val numtwo=etNumberTwo.text.toString()
                    if (numone.isBlank()){
                        etNumberOne.setError("Enter a number")
                        return@setOnClickListener
                    }
                    if (numtwo.isBlank()){
                        etNumberTwo.setError("Enter a number")
                        return@setOnClickListener
                    }
                    multiplyNumbers(numone.toInt(), numtwo.toDouble())


                    btnModulus.setOnClickListener {
                        val numone=etNumberOne.text.toString()
                        val numtwo=etNumberTwo.text.toString()
                        if (numone.isBlank()){
                            etNumberOne.setError("Enter a number")
                            return@setOnClickListener
                        }
                        if (numtwo.isBlank()){
                            etNumberTwo.setError("Enter a number")
                            return@setOnClickListener
                        }
                        AddNumbers(numone.toInt(), numtwo.toDouble())
                        subtractNumbers(numone.toInt(), numtwo.toDouble())
                        multiplyNumbers(numone.toInt(), numtwo.toDouble())
                        modulusNumbers(numone.toInt(), numtwo.toDouble())
                    }
                    modulusNumbers(numone.toInt(), numtwo.toDouble())
                }
            }
        }
    }
    fun AddNumbers(numa:Int,numb:Double){
        var numbers1=numa+numb
        tvResult.text =numbers1.toString()

    }
    fun subtractNumbers(numa:Int,numb:Double){
        var numbers2=numa-numb
        tvResult.text =numbers2.toString()
    }
    fun multiplyNumbers(numa:Int,numb:Double){
        var numbers3=numa*numb
        tvResult.text =numbers3.toString()
    }
    fun modulusNumbers(numa:Int,numb:Double){
        var numbers4=numa%numb
        tvResult.text =numbers4.toString()
    }
}