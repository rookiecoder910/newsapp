package com.example.newsapp.screens

import androidx.compose.runtime.Composable
import com.example.newsapp.viewmodel.PostViewModel

@Composable
fun PostScreen(viewModel: PostViewModel){
    val posts=viewModel.posts
    PostList(posts=posts)

}