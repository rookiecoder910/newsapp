package com.example.newsapp.repository


import com.example.newsapp.retrofit.Post
import com.example.newsapp.retrofit.RetrofitInstance


class PostRepository {
    //Repository acts as a mediator between data source(network api) and view model
    private val apiService= RetrofitInstance.api
    suspend fun getPosts():List<Post>{
        return apiService.getPosts()
    }
}