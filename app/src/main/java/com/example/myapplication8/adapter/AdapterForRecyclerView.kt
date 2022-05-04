
// =============================================================================
//// ---------------------------------------------------------------------------
//// Creation Date: 05-May-2022
//// Author: Bibekananda Nayak
//// Version: 1.0
//// Class Name: MainActivity
//// description: This is the main Activity class where we do all the logical
////              operation for our project
//// ---------------------------------------------------------------------------
// =============================================================================


package com.example.myapplication8.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication8.databinding.CardBinding
import com.example.myapplication8.model.Post
import com.example.myapplication8.recyclerView.ViewHolderClass

class AdapterForRecyclerView (private val largeNewsList: List<Post>) : RecyclerView.Adapter<ViewHolderClass>() {
    private lateinit var binding: CardBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        binding = CardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderClass(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val largeNews= largeNewsList[position]
        holder.bind(largeNews)
    }

    override fun getItemCount(): Int =largeNewsList.size
}