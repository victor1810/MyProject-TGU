package com.example.myproject_tgu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val button: Button = findViewById(R.id.android)
        button.setOnClickListener {
            val androidLink = Uri.parse("https://www.android.com/")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, androidLink)
            startActivity(openBrowserIntent)
        }

    }
}