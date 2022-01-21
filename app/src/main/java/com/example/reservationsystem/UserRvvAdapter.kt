package com.example.reservationsystem

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.reservationsystem.Database.Users

class UserRvvAdapter(val context: Context): RecyclerView.Adapter<UserRvvAdapter.userViewHolder>() {

    val allData = ArrayList<Users>()
    inner class userViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView = itemView.findViewById<TextView>(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userViewHolder {
        val viewholder = userViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_data_view, parent,false))
        return viewholder
    }

    override fun onBindViewHolder(holder: userViewHolder, position: Int) {
        val currentuser = allData[position]
        holder.textView.text= currentuser.name
    }

    override fun getItemCount(): Int {
        return allData.size
    }
}