package com.example.topprogramminglanguages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ProgrammingAdapter (var listofProgLanguages:ArrayList<ProgrammingModels>): RecyclerView.Adapter<ProgrammingAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        lateinit var imgView:ImageView
        lateinit var txtTitle:TextView
        lateinit var txtContent:TextView
        init {
            imgView = itemView.findViewById(R.id.imgView)
            txtTitle = itemView.findViewById(R.id.txtTitle)
            txtContent = itemView.findViewById(R.id.txtContent)
            //Event
            itemView.setOnClickListener {
                Toast.makeText(itemView.context,"You selected: ${listofProgLanguages[adapterPosition].title}",Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.programming_item_layou,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listofProgLanguages.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgView.setImageResource(listofProgLanguages[position].img)
        holder.txtTitle.setText(listofProgLanguages[position].title)
        holder.txtContent.setText(listofProgLanguages[position].content)
    }
}