package com.jacinthmahanta.androidappdevelopment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.b12)
        button.setOnClickListener {
            val p = Intent(applicationContext, MainActivity2::class.java)
                startActivity(p) 
        }
    }
}