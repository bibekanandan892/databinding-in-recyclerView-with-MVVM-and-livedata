package com.example.myapplication8.recyclerView

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication8.databinding.CardBinding
import com.example.myapplication8.model.Post

class ViewHolderClass(private val binding: CardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(post: Post){
        binding.posts1=post
    }
}