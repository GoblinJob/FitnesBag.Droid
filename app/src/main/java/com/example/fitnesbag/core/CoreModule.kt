package com.example.fitnesbag.core

import android.content.Context
import androidx.room.Room
import com.example.fitnesbag.App
import com.example.fitnesbag.core.services.AppInitService
import com.example.fitnesbag.core.services.impl.AppInitServiceImpl
import com.example.fitnesbag.data.FitnesBagDatabase
import com.example.fitnesbag.data.dao.*
import com.example.fitnesbag.data.service.DefaultDBFillService
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class CoreModule {
    @Provides
    @Singleton
    fun provideAppInit(defaultDBFillService: DefaultDBFillService) : AppInitServiceImpl {
        return AppInitServiceImpl(defaultDBFillService)
    }
}
