package com.example.fitnesbag

import com.example.fitnesbag.data.DaoModule
import com.example.fitnesbag.view.MainActivity
import com.example.fitnesbag.view.fragments.HomeFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DaoModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: HomeFragment)
}
