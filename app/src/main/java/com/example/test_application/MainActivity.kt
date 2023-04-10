package com.example.test_application

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val textValue = findViewById<EditText>(R.id.editTextTextPersonName)

        sendButton.setOnClickListener {
            val detail = Intent(this, Detail::class.java)
            detail.putExtra("value", textValue.text.toString())
            startActivity(detail)
        }
    }
}