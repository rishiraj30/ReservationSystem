package com.example.reservationsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register_user.*

class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)


    }

    fun submitData(view: android.view.View) {
        val userText = name.text.toString()
        if (userText.isNotEmpty()){

        }
    }
}