package com.example.fitnesbag.core

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AuthViewModel : ViewModel() {
    private val _email = MutableLiveData<String>()
    private val _password = MutableLiveData<String>()

    val email : LiveData<String>
        get() = _email
    val password : LiveData<String>
        get() = _password

    fun updateEmail(email: String) {
        _email.value = email
    }
    fun updatePassword(password: String) {
        _password.value = password
    }
}