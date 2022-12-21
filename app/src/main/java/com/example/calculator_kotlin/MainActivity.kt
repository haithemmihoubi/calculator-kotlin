package com.example.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun  onDigit(view: View) {
      val digit = view as Button
        val digitText = digit.text.toString()
        Toast.makeText(this, digitText, Toast.LENGTH_LONG).show()
        /*val result = findViewById<TextView>(R.id.result)
        val expression = findViewById<TextView>(R.id.expression)
        if (result.text == "0") {
            result.text = digitText
        } else {
            result.append(digitText)
        }
        expression.append(digitText)*/
    }
}