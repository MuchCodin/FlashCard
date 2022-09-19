package com.example.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashCardQuestion = findViewById<TextView>(R.id.flash_card_question)
        val flashCardAnswer1 = findViewById<TextView>(R.id.flash_card_answer1)
        val flashCardAnswer2 = findViewById<TextView>(R.id.flash_card_answer2)
        val flashCardAnswer3 = findViewById<TextView>(R.id.flash_card_answer3)
        val Button = findViewById<Button>(R.id.hide_button)

        flashCardAnswer1.setOnClickListener {
            findViewById<TextView>(R.id.flash_card_answer1).setBackgroundColor(getResources().getColor(R.color.red))
            findViewById<TextView>(R.id.flash_card_answer3).setBackgroundColor(getResources().getColor(R.color.green))
        }
        flashCardAnswer2.setOnClickListener {
            findViewById<TextView>(R.id.flash_card_answer2).setBackgroundColor(getResources().getColor(R.color.red))
            findViewById<TextView>(R.id.flash_card_answer3).setBackgroundColor(getResources().getColor(R.color.green))
        }
        flashCardAnswer3.setOnClickListener {
            findViewById<TextView>(R.id.flash_card_answer3).setBackgroundColor(getResources().getColor(R.color.green))
        }

        Button.setOnClickListener {
            flashCardAnswer1.visibility = View.INVISIBLE
            flashCardAnswer2.visibility = View.INVISIBLE
            flashCardAnswer3.visibility = View.INVISIBLE
            flashCardQuestion.visibility = View.INVISIBLE
        }
    }
}