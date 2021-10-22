package com.example.myapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import  kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var btnMessage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMessage = findViewById(R.id.btnMessage)
        btnMessage.setOnClickListener {
            Toast.makeText(this, "Logged in successfully!", Toast.LENGTH_LONG).show()
        }

    }
}



