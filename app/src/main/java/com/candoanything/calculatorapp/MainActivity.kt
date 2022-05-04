package com.candoanything.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView?= null
    var lastNumeric: Boolean = false
    var lastDot : Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
    }


    fun onDigit(view: View){
        tvInput?.append((view as Button).text)
        lastNumeric = true

    }

    fun onClear(view: View){
        tvInput?.text = ""
        lastNumeric = false // I make this.
        lastDot = false // I make this.

    }

    fun onDecimalPoint(view: View){
        if(lastNumeric && !lastDot){ // no duplicate dot in the view.
            tvInput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}