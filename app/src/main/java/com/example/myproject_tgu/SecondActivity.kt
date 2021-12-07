package com.example.myproject_tgu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button: Button = findViewById(R.id.next_activity_2)
        button.setOnClickListener {
            intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}