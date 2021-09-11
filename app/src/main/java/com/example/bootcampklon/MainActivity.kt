package com.example.bootcampklon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.first_screen_button)

        val questionWord: String = ""

        startButton.setOnClickListener {
            val intent = Intent(this@MainActivity, WordTestActivity::class.java).apply {
                putExtra("msg", "question" )
            }
            startActivity(intent)
        }

    }
}