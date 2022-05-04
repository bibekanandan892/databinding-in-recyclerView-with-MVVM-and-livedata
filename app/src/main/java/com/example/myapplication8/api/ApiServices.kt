package com.example.myapplication8.api

import com.example.myapplication8.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("posts")
    suspend fun getPost(): Response<List<Post>>
}