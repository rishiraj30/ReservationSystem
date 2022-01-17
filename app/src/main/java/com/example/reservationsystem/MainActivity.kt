package com.example.reservationsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        registerbutton.setOnClickListener{
            var reintent = Intent(this, RegisterUser::class.java)
            startActivity(reintent)
        }

        vubutton.setOnClickListener {
            var newintent = Intent(this, ViewUser::class.java)
            startActivity(newintent)
        }
    }
}