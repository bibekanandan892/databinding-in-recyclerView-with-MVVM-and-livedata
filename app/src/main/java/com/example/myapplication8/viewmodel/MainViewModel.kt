package com.example.myapplication8.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication8.model.Post
import com.example.myapplication8.repo.PostRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: PostRepository): ViewModel() {
    val post : LiveData<List<Post>>
        get() = repository.post
    init {
        viewModelScope.launch {
            repository.getPost()
        }
    }
}