package com.example.ui_quiz_289_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button6.setOnClickListener {
            val intent = Intent(this, Main2_ui_quiz_2892::class.java)
            startActivity(intent)
        }
    }
}
