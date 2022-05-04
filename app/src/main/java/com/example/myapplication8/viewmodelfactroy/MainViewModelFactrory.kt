package com.example.myapplication8.viewmodelfactroy

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication8.repo.PostRepository
import com.example.myapplication8.viewmodel.MainViewModel

class MainViewModelFactrory(private val repository: PostRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}