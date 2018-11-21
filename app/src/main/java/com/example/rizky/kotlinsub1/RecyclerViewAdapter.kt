package com.example.rizky.kotlinsub1

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import org.jetbrains.anko.AnkoContext

class RecyclerViewAdapter(val items: List<Club>, val listener: (Club) -> Unit) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(ClubUI().createView(AnkoContext.create(parent.context, parent)))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], listener)
    }

    inner class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        val img = itemView.findViewById<ImageView>(ClubUI.club.img_club)
        val nama = itemView.findViewById<TextView>(ClubUI.club.nama_club)

        fun bind(item: Club, listener: (Club) -> Unit) {
            Glide.with(itemView.context)
                    .load(item.img)
                    .into(img)

            nama.text = item.nama

            itemView.setOnClickListener{listener(item)}
        }
    }
}