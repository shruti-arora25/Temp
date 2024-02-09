package com.arora.blueprint

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arora.blueprint.databinding.ListItemBinding

class Adapter(private val content:ArrayList<Content>):RecyclerView.Adapter<Adapter.MyViewHolder>() {

    private lateinit var binding: ListItemBinding





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding=ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val currentItem=content[position]
        holder.name1.text=currentItem.name1
        holder.name2.text=currentItem.name2
        holder.name3.text=currentItem.name3
        holder.name4.text=currentItem.name4

    }

    override fun getItemCount(): Int {

        return content.size
    }




    class MyViewHolder(binding:ListItemBinding):RecyclerView.ViewHolder(binding.root){
        var name1=binding.name1
        var name2=binding.name2
        var name3=binding.name3
        var name4=binding.name4
    }



}