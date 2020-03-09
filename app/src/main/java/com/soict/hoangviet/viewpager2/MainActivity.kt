package com.soict.hoangviet.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_view_pager.*
import kotlinx.android.synthetic.main.item_view_pager.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter = DemoViewPagerAdapter()
        viewpager.orientation = ViewPager2.ORIENTATION_VERTICAL
        // Set the icon and text for each tab
        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            tab.text = "Tab ${position}"
        }.attach()
    }
}
