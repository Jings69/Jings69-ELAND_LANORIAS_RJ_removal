package com.example.reviewerapp.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.reviewerapp.R

class UserDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        val userDetailsTextView: TextView = findViewById(R.id.userDetailsTextView)
        val username = intent.getStringExtra("username")
        userDetailsTextView.text = "Welcome, $username"
    }
}
