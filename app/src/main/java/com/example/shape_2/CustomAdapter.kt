package com.example.shape_2


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var list: ArrayList<data>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Image: ImageView = itemView.findViewById(R.id.image)
        val Text: TextView = itemView.findViewById(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.shape, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.Image.setImageResource(list[position].image)
        holder.Text.text =""

        var isClick = false
        holder.Image.setOnClickListener {
            if (!isClick) {
                holder.Text.text= list[position].text
                isClick = true
            } else {
                holder.Text.text=""
                isClick = false
            }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}