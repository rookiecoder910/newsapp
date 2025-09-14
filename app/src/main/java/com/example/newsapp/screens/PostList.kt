package com.example.newsapp.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.retrofit.Post

@Composable
fun PostList(posts:List<Post>){
    LazyColumn{
        item {
            HeaderComposable()
        }
        items(posts){
            post-> PostItem(post=post)

        }
    }

}
@Composable
fun HeaderComposable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "The News App",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Get the latest Posts & News",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        )
    }
}
