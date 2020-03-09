package com.soict.hoangviet.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_view_pager.*
import kotlinx.android.synthetic.main.item_view_pager.view.*

class DemoViewPagerAdapter : RecyclerView.Adapter<DemoViewPagerAdapter.EventViewHolder>() {
    val eventList = listOf("0", "1", "2")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EventViewHolder(LayoutInflater.from(parent.context).inflate(
                R.layout.item_view_pager,
                parent,
                false
            )
        )

    override fun getItemCount() = eventList.size

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind()
    }

    class EventViewHolder(override val containerView: View?) :
        RecyclerView.ViewHolder(containerView!!), LayoutContainer {
        fun bind() {
            tvPage.text = "Page ${adapterPosition}"
            cslPage.background = ContextCompat.getDrawable(
                containerView!!.context, if (adapterPosition % 2 == 0)
                    R.color.colorBlue else
                    R.color.colorOrangeYellow
            )
        }
    }
}