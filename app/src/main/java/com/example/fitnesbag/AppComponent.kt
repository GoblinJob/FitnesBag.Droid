package com.example.fitnesbag

import com.example.fitnesbag.data.RepositoryModule
import com.example.fitnesbag.view.fragments.HomeFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class])
interface AppComponent {
    fun inject(activity: HomeFragment)
}