package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val newsList: ArrayList<News>) : RecyclerView.Adapter<MyViewHolder>() {

    private lateinit var mListener: OnItemClickListener

    fun setOnClickListener(listener: OnItemClickListener){
        mListener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView,mListener)
    }

    override fun getItemCount() = newsList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val news = newsList[position]
        holder.titleImage.setImageResource(news.titleImage)
        holder.heading.text = news.heading



    }


}