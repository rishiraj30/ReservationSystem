package com.example.reservationsystem.Database

import androidx.lifecycle.LiveData

class UserRepo (private val userDao: UserDao){

    val getData: LiveData<List<Users>> = userDao.getData()

    suspend fun insert(users: Users){
        userDao.insert(users)
    }

    suspend fun delete(users: Users){
        userDao.delete(users)
    }
}