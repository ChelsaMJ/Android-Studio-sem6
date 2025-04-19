package com.example.unit4

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab
import com.google.android.material.tabs.TabLayoutMediator

class SwipeViews1 : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_swipe_views1)

        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = ViewGroup(this)
        val tab_layout = findViewById<TabLayout>(R.id.tab_layout)
        val adapter = ViewGroup(this)

        TabLayoutMediator(tab_layout,viewPager){
            tab,position ->
            tab.text = adapter.getTabTitle(position)
        }.attach()


    }
}