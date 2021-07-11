package com.example.fitnesbag

import android.app.Application
import android.content.Context
import com.example.fitnesbag.core.CoreModule
import com.example.fitnesbag.data.DaoModule

class App : Application() {
    companion object {
        lateinit var instance: App
    }
    
    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()
        
        instance = this;
        appComponent = DaggerAppComponent.create()
    }
}
