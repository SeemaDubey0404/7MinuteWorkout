package com.example.a7minuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val llStart = findViewById<LinearLayout>(R.id.llStart)
        llStart.setOnClickListener {
         //   Toast.makeText(this,"hello",Toast.LENGTH_LONG).show() }
            val intent = Intent(this, ExerciseActivity::class.java)
                startActivity(intent)
            }

        }

}


