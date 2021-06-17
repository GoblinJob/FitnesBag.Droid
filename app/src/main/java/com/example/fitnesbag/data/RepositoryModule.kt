package com.example.fitnesbag.data

import androidx.annotation.NonNull
import com.example.fitnesbag.data.repository.ExerciseRepository
import com.example.fitnesbag.data.repository.TrainRepository
import com.example.fitnesbag.data.repository.TrainsProgramRepository
import com.example.fitnesbag.data.repository.impl.ExerciseRepositoryImpl
import com.example.fitnesbag.data.repository.impl.TrainRepositoryImpl
import com.example.fitnesbag.data.repository.impl.TrainsProgramRepositoryImpl
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

    @Provides
    @Singleton
    fun provideTrainRepository() : TrainRepository {
        return TrainRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideTrainsProgramRepository() : TrainsProgramRepository {
        return TrainsProgramRepositoryImpl()
    }
}