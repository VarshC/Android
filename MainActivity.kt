package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private lateinit var no1: EditText
    private lateinit var no2: EditText
    private lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        no1 = findViewById<EditText>(R.id.first_number)
        no2 = findViewById<EditText>(R.id.second_number)
        result = findViewById<TextView>(R.id.result)
    }

    fun addition(view:View){
        /*var no1 = findViewById<EditText>(R.id.first_number)
        var no2 = findViewById<EditText>(R.id.second_number)*/
        var sum = no1.text.toString().toDouble() + no2.text.toString().toDouble()
        //var result = findViewById<TextView>(R.id.result)
        result.setText(sum.toString())
    }
    fun multiplication(view:View){
        var mult = no1.text.toString().toDouble() * no2.text.toString().toDouble()
        result.setText(mult.toString())
    }
    fun division(view:View){
        var div = no1.text.toString().toDouble() / no2.text.toString().toDouble()
        result.setText(div.toString())
    }
    fun subtraction(view:View){
        var diff = no1.text.toString().toDouble() - no2.text.toString().toDouble()
      result.setText(diff.toString())

    }
}
