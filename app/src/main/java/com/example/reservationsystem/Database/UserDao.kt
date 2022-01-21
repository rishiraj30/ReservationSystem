package com.example.reservationsystem.Database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(users: Users)

    @Delete
    suspend fun delete(users: Users)

    @Query("Select * from User")
    fun getData() : LiveData<List<Users>>

}