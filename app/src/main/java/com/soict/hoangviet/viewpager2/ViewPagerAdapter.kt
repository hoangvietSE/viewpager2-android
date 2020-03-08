package com.soict.hoangviet.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.lang.IndexOutOfBoundsException

const val PAGE_INDEX_FIRST = 0
const val PAGE_INDEX_TWO = 1

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val tabFragmentCreators: Map<Int, () -> Fragment> = mapOf(
        PAGE_INDEX_FIRST to { PageFragment.getInstance(PAGE_INDEX_FIRST) },
        PAGE_INDEX_TWO to { PageFragment.getInstance(PAGE_INDEX_TWO) }
    )

    override fun getItemCount() = tabFragmentCreators.size

    override fun createFragment(position: Int): Fragment =
        tabFragmentCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
}