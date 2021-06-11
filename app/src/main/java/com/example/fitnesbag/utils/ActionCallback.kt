package com.example.fitnesbag.utils

class ActionCallback(private val callback: () -> Unit) {
    fun invoke() {
        callback.invoke();
    }
}
