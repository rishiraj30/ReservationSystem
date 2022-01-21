package com.example.reservationsystem.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.Inet4Address

@Entity(tableName = "User")
class Users(@ColumnInfo(name = "Name") val name: String, val age: Int,
            val address: String,
            val mobn: Int, val email: String,
            @PrimaryKey(autoGenerate = true) val userid: Int)
