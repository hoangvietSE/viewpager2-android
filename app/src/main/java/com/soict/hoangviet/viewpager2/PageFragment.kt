package com.soict.hoangviet.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.item_fragment.*

class PageFragment private constructor() : Fragment() {
    private var position: Int? = null

    companion object {
        fun getInstance(position: Int): PageFragment {
            val pageFragment = PageFragment()
            val bundle = Bundle()
            bundle.putInt("position", position)
            pageFragment.arguments = bundle
            return pageFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getData()
    }

    private fun getData() {
        position = arguments?.getInt("position")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initPage(position ?: -1)
    }

    fun initPage(position: Int) {
        tvViewPage.text = "Page ${position}"
        cslViewPage.background = ContextCompat.getDrawable(
            requireContext(), if (position % 2 == 0)
                R.color.colorBlue else
                R.color.colorOrangeYellow
        )
        when (position) {
            PAGE_INDEX_FIRST -> {
                //do-something
            }
            PAGE_INDEX_TWO -> {
                //do-something
            }
        }
    }
}