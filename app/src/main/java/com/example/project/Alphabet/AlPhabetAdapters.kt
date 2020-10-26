package com.example.project.Alphabet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.project.R
import kotlinx.android.synthetic.main.grid_view_layout_items.view.*


class AlPhabetAdapters(private val children : List<AlphabetViewModel>)
    : RecyclerView.Adapter<AlPhabetAdapters.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =  LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_view_layout_items,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]
        holder.imageView.setImageResource(child.image)
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val imageView: ImageView = itemView.icon_image_view

    }
}