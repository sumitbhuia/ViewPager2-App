package com.example.viewpagerapp.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerapp.MainActivity
import com.example.viewpagerapp.fragments.Fragment1
import com.example.viewpagerapp.fragments.Fragment2
import com.example.viewpagerapp.fragments.Fragment3

//making an fragment state adapter , which handles the different state of fragments
class MyAdapter(mainActivity: MainActivity):FragmentStateAdapter(mainActivity) {

    private val fragment_size = 3
    override fun getItemCount(): Int {
        //return the size of the fragment array i.e. how many fragments to accommodate
       return this.fragment_size
    }

    override fun createFragment(position: Int): Fragment {
        //relate array fragment position to action fragment
       when(position){
           0->{
               return Fragment1()
           }
           1->{
               return Fragment2()
           }
           2->{
               return Fragment3()
           }
       }
        //default case
        return Fragment1()

    }
}