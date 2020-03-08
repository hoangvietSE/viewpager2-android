package com.soict.hoangviet.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

class DemoViewPagerAdapter : RecyclerView.Adapter<DemoViewPagerAdapter.EventViewHolder>() {
    val eventList = listOf("0", "1", "2")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_view_pager,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = eventList.size

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.itemView.apply {
            tvPage.text = "Page ${position}"
            cslPage.background = ContextCompat.getDrawable(
                context, if (position % 2 == 0)
                    R.color.colorBlue else
                    R.color.colorOrangeYellow
            )
        }
    }

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}