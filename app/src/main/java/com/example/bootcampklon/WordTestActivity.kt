package com.example.bootcampklon

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WordTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_test)

        val msg = intent.getStringExtra("msg")

    }
}