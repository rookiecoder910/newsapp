package com.example.newsapp.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsapp.repository.PostRepository
import com.example.newsapp.retrofit.Post
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
   private val repository= PostRepository()
    var posts by mutableStateOf<List<Post>>(emptyList())
    private set //only PostViewModel can change 'posts'

//launch a coroutine to fetch posts from the repository
    init{
        viewModelScope.launch {
            //fetching data from repository
            val fetchedPosts= repository.getPosts()
            //updating the state with fetched data
            //any update to ''posts'' will trigger a recomposition of the UI that reads this state
            posts= fetchedPosts
        }
    }
}
