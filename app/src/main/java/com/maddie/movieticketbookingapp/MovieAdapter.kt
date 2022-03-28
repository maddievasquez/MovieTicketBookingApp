package com.maddie.movieticketbookingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.maddie.movieticketbookingapp.R.id.movie_image

class MovieAdapter(private val movieList : ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
val itemView = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent,false)
        return MyViewHolder(itemView)
    }
        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

            val currentItem = movieList[position]
            holder.movie_image.setImageResource(currentItem.image)
            holder.tvHeading.text = currentItem.name
        }

        override fun getItemCount(): Int {
            return movieList.size
        }

        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val movie_image: ShapeableImageView = itemView.findViewById(R.id.movie_image)
            val tvHeading: TextView = itemView.findViewById(R.id.tvHeading)

        }
    }

