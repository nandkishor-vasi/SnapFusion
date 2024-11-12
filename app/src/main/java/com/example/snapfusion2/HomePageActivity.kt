// app/java/com/example/snapfusion/HomePageActivity.kt
package com.example.snapfusion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.snapfusion2.R

class HomePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        // Set up Explore Features button
        val exploreFeaturesButton = findViewById<Button>(R.id.exploreFeaturesButton)
        exploreFeaturesButton.setOnClickListener {
            Toast.makeText(this, "Navigating to Features", Toast.LENGTH_SHORT).show()
            // Intent to navigate to FeaturesActivity (create this later if needed)
            // startActivity(Intent(this, FeaturesActivity::class.java))
        }

        // Set up Log Out button
        val logoutButton = findViewById<Button>(R.id.logoutButton)
        logoutButton.setOnClickListener {
            Toast.makeText(this, "Logging out...", Toast.LENGTH_SHORT).show()
            // Redirect to SignInActivity
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
    }
}
