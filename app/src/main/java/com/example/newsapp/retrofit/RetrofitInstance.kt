package com.example.newsapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    //base url
    private const val BASE_URL="https://jsonplaceholder.typicode.com/"
     val api: ApiService by lazy{
//by lazy delays the initialization of the variable until it is first accessed
val retrofit= Retrofit.Builder()
    .baseUrl(BASE_URL)
         .addConverterFactory(GsonConverterFactory.create())
         .build()
         retrofit.create(ApiService::class.java)
     }
}