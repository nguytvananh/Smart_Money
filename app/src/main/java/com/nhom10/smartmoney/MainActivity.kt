package com.nhom10.smartmoney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var ibBack: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ibBack = findViewById(R.id.ib_back)
        ibBack.setOnClickListener {
            // chuyen activiy main sang activy B
            val intent = Intent(this@MainActivity, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}