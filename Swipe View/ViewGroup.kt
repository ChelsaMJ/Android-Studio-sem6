package com.example.unit4

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewGroup (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity)
{
    override fun getItemCount(): Int = 3
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> camerafragment()
            1 -> chatfragment()
            2 -> profilefragment()

            else -> throw IllegalStateException("Invalid position $position")
        }
    }

    fun getTabTitle(position: Int):String{
        return when(position){
            0 -> "Camera"
            1 -> "Chat"
            2 -> "Profile"
            else -> ""
        }
    }
}