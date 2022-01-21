package com.example.reservationsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reservationsystem.Database.UserViewModel
import kotlinx.android.synthetic.main.activity_view_user.*

class ViewUser : AppCompatActivity() {

    lateinit var viewUser: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_user)

        viewUser = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application))
            .get(UserViewModel::class.java)

        viewUser.getData.observe(this, Observer {

        })

        dataview.layoutManager = LinearLayoutManager(this)
        val adapter = UserRvvAdapter(this)

        dataview.adapter = adapter

    }
}