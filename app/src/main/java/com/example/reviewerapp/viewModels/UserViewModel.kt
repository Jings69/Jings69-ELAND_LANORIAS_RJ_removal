package com.example.reviewerapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    private val _userList = MutableLiveData<List<String>>()
    val userList: LiveData<List<String>> = _userList

    init {
        loadUsers()
    }

    private fun loadUsers() {
        _userList.value = listOf("Alice", "Bob", "Charlie")
    }
}