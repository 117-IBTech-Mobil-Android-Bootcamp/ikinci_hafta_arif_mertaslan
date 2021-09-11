package com.example.bootcampklon

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WordTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_test)

        val questionWord = intent.getStringExtra("question")
        val answers = intent.getStringArrayExtra("answers")

        val questionTextView: TextView = findViewById(R.id.question_text)
        val answerATextView: TextView = findViewById(R.id.option_a_text)
        val answerBTextView: TextView = findViewById(R.id.option_b_text)
        val answerCTextView: TextView = findViewById(R.id.option_c_text)
        val answerDTextView: TextView = findViewById(R.id.option_d_text)

        questionTextView.text = questionWord
        answerATextView.text = answers?.get(0)
        answerBTextView.text = answers?.get(1)
        answerCTextView.text = answers?.get(2)
        answerDTextView.text = answers?.get(3)
    }
}