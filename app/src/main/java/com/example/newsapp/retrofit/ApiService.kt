package com.example.newsapp.retrofit

import retrofit2.http.GET

interface ApiService {
    //define the endpoint for fetching posts
    @GET("posts")
    suspend fun getPosts(): List<Post>


}