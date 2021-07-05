package com.onovughe.week_five_task

import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.onovughe.week_five_task.databinding.NameItemBinding

class NameAdapter(val names: List<NameModel>): RecyclerView.Adapter<NameAdapter.NameViewHolder>() {
    class NameViewHolder(val binding: NameItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(name: NameModel){
            binding.firstName.text = name.firstName
            binding.lastName.text = name.lastName
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val binding: NameItemBinding = NameItemBinding.inflate(LayoutInflater.from(parent.context))
        return NameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        val name = names.get(position)
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return names.size
    }
    public interface NameItemClickListener{
        fun onItemClick(item: NameModel, Position: Int)
    }
}
