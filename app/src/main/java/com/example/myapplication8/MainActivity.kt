package com.example.myapplication8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication8.adapter.AdapterForRecyclerView
import com.example.myapplication8.api.NetworkInstance
import com.example.myapplication8.databinding.ActivityMainBinding
import com.example.myapplication8.repo.PostRepository
import com.example.myapplication8.viewmodel.MainViewModel
import com.example.myapplication8.viewmodelfactroy.MainViewModelFactrory

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val apiServices = NetworkInstance().NetworkInstance()
        val repository= PostRepository(apiServices,this.applicationContext)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel= ViewModelProvider(this,MainViewModelFactrory(repository)).get(MainViewModel::class.java)
        val recyclerViewNews = binding.rvNews
        mainViewModel.post.observe(this){
            val newsAdapter = AdapterForRecyclerView(it)
            recyclerViewNews.adapter= newsAdapter
            recyclerViewNews.layoutManager = LinearLayoutManager(this)
            recyclerViewNews.setHasFixedSize(true)
        }

    }
}