package com.example.snapfusion2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity : AppCompatActivity() {
    private lateinit var feedRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        feedRecyclerView = findViewById(R.id.feedRecyclerView)
        feedRecyclerView.layoutManager = LinearLayoutManager(this)

        // Example list of posts
        val posts = listOf(
            Post("user1", "Hello world!"),
            Post("user2", "This is a post content."),
            Post("user3", "Another post here.")
        )

        feedRecyclerView.adapter = FeedAdapter(posts)
    }
}
