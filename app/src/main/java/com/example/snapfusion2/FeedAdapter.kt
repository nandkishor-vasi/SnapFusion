package com.example.snapfusion2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FeedAdapter {
    data class Post(
        val username: String,
        val content: String,
        val imageUrl: String? = null
    )


    class FeedAdapter(private val posts: List<Post>) : RecyclerView.Adapter<FeedAdapter.PostViewHolder>() {

        // ViewHolder class to represent each item
        inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val usernameTextView: TextView = itemView.findViewById(R.id.usernameTextView)
            val contentTextView: TextView = itemView.findViewById(R.id.contentTextView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
            return PostViewHolder(view)
        }

        override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
            val post = posts[position]
            holder.usernameTextView.text = post.username
            holder.contentTextView.text = post.content
        }

        override fun getItemCount(): Int = posts.size
    }


}