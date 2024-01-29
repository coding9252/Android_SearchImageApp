package com.gahyeon.android_searchimageapp

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPager2Adapter(activity:AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int) = when(position) {
        0 -> SearchFragment()
        1 -> MyArchiveFragment()
        else -> throw IllegalStateException("Invalid position: $position")
    }
}