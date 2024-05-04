package com.example.shape_2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.shape_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var itemlist:ArrayList<data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        itemlist= ArrayList()
        itemlist.add(data(R.drawable.circle,"Circle"))
        itemlist.add(data(R.drawable.pentagon,"Pentagon"))
        itemlist.add(data(R.drawable.rectangle,"Rectangle"))
        itemlist.add(data(R.drawable.square,"Square"))
        itemlist.add(data(R.drawable.star,"Star"))
        itemlist.add(data(R.drawable.triangle,"Triangle"))
        binding.rec.layoutManager= StaggeredGridLayoutManager(2,RecyclerView.VERTICAL)
        binding.rec.adapter=CustomAdapter(itemlist)

    }


}