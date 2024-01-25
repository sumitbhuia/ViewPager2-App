package com.example.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerapp.adapter.MyAdapter

class MainActivity : AppCompatActivity() {

    // making instances to connect later
    lateinit var myAdapter: MyAdapter
    lateinit var viewPager: ViewPager2




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //connecting instances
        viewPager = findViewById(R.id.viewPager)
        myAdapter = MyAdapter(this)

        //setting viewPager orientation
        viewPager.orientation= ViewPager2.ORIENTATION_HORIZONTAL

        //3 - connecting adapter
        viewPager.adapter = myAdapter
    }
}