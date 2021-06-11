package com.example.fitnesbag.core

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.Navigation
import com.example.fitnesbag.R
import com.example.fitnesbag.utils.ActionCallback
import com.google.android.material.button.MaterialButton

class AuthViewModel : ViewModel() {
    private val _email = MutableLiveData<String>()
    private val _password = MutableLiveData<String>()
    private val _onSignInAction = MutableLiveData<ActionCallback>()

    val email : LiveData<String>
        get() = _email
    val password : LiveData<String>
        get() = _password
    
    fun setOnSignInAction(action: ActionCallback) {
        _onSignInAction.value = action
    }

    fun sigIn()
    {
        _onSignInAction.value!!.invoke();
    }
}
