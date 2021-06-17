package com.example.fitnesbag

import android.app.Application
import com.example.fitnesbag.data.RepositoryModule

class App : Application() {
    companion object {
        lateinit var appComponent : AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
                .builder()
                .repositoryModule(RepositoryModule())
                .build()
    }
}