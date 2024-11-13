package com.example.snapfusion

data class Post(
    val username: String,
    val content: String,
    val imageUrl: String? = null // Optional, for posts that might have images
)
