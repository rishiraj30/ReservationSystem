package com.example.reservationsystem.Database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class UserViewModel(application: Application) : AndroidViewModel(application){

    val getData = LiveData<List<Users>>

    init {
        val dao = UserDatabase.getDatabase(application).userDao()
        val repo = UserRepo(dao)
        getData = repo.getData
    }
}