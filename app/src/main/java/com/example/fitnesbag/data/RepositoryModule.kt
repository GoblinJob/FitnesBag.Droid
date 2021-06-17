package com.example.fitnesbag.data

import androidx.annotation.NonNull
import com.example.fitnesbag.data.repository.ExerciseRepository
import com.example.fitnesbag.data.repository.impl.ExerciseRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideExerciseRepository() : ExerciseRepository {
        return ExerciseRepositoryImpl()
    }
}