package com.example.fitnesbag

import android.content.Context
import androidx.room.Room
import com.example.fitnesbag.data.FitnesBagDatabase
import com.example.fitnesbag.data.dao.TrainProgramDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val context: Context) {
    
    @Provides
    @Singleton
    fun provideContext(): Context {
        return context
    }
}
