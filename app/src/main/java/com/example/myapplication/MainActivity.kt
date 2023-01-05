package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text = findViewById<TextView>(R.id.wysw).text.toString() + 1
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="2"
            findViewById<TextView>(R.id.wysw).text = findViewById<TextView>(R.id.wysw).text.toString() + 2
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="3"
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="+"
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="4"
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="5"
        }
        findViewById<Button>(R.id.button7).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="6"
        }
        findViewById<Button>(R.id.button8).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="-"
        }
        findViewById<Button>(R.id.button9).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="7"
        }
        findViewById<Button>(R.id.button10).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="8"
        }
        findViewById<Button>(R.id.button11).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="9"
        }
        findViewById<Button>(R.id.button12).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="*"
        }
        findViewById<Button>(R.id.button13).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text=" "
        }
        findViewById<Button>(R.id.button14).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="0"
        }
        findViewById<Button>(R.id.button15).setOnClickListener {
            findViewById<TextView>(R.id.wysw).text="/"
        }
        findViewById<Button>(R.id.button16).setOnClickListener {

        }

    }

}