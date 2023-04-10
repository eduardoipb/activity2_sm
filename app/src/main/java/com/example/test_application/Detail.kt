package com.example.test_application

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val inputTextTyped = findViewById<TextView>(R.id.text_typed)

        val data = intent.extras
        val value = data?.getString("value")

        inputTextTyped.setText(value)
    }
}