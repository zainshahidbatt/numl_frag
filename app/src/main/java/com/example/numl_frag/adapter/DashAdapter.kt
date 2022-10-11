package com.example.numl_frag.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.numl_frag.R

import com.example.numl_frag.model.ItemsViewModel

class DashAdapter(val itemList:ArrayList<ItemsViewModel>):RecyclerView.Adapter<DashAdapter.ViewHolder>() {







    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val v=LayoutInflater.from(parent.context).inflate(R.layout.programs_card_desgin,parent,false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(itemList[position])
    }

    override fun getItemCount(): Int {
       return itemList.size
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        fun bindItems(itemsViewModel: ItemsViewModel){
            val tvtitle=itemView.findViewById(R.id.tvTitle) as TextView
            val imgIcon=itemView.findViewById(R.id.imgIcon) as ImageView
            tvtitle.text=itemsViewModel.text
            imgIcon.setImageResource(itemsViewModel.image)
        }

    }
}