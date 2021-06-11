package com.example.fitnesbag.core

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fitnesbag.utils.ActionCallback

class RegistrationViewModel: ViewModel() {
    private val _email = MutableLiveData<String>()
    private val _password = MutableLiveData<String>()
    private val _number = MutableLiveData<String>()
    private val _onRegistrationAction = MutableLiveData<ActionCallback>()

    val email : LiveData<String>
        get() = _email
    val password : LiveData<String>
        get() = _password
    val number : LiveData<String>
        get() = _number

    fun setOnRegistrationAction(action: ActionCallback) {
        _onRegistrationAction.value = action
    }

    fun registration()
    {
        _onRegistrationAction.value!!.invoke();
    }
}
