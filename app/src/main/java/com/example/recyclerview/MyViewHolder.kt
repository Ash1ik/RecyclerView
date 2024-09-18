package com.example.recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyViewHolder(itemView: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {

    val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
    val heading: TextView = itemView.findViewById(R.id.tvHeading)

    init {
        itemView.setOnClickListener {
            listener.onItemClick(adapterPosition)
        }
    }

}