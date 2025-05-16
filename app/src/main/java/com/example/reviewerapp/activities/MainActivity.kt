package com.example.reviewerapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.reviewerapp.R
import com.example.reviewerapp.viewModels.UserViewModel

class MainActivity : AppCompatActivity() {

    private val userViewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userListView: ListView = findViewById(R.id.userListView)

        userViewModel.userList.observe(this) { users ->
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
            userListView.adapter = adapter
        }

        userListView.setOnItemClickListener{ _, _, position, _ ->
            val intent = Intent(this, UserDetailsActivity::class.java)
            intent.putExtra("username", userViewModel.userList.value?.get(position))
            startActivity(intent)
        }
    }
}