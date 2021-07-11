package com.example.fitnesbag.data

import android.app.Application
import android.content.Context
import androidx.annotation.NonNull
import androidx.room.Room
import com.example.fitnesbag.App
import com.example.fitnesbag.data.dao.*
import com.example.fitnesbag.data.service.DefaultDBFillService
import com.example.fitnesbag.data.service.impl.DefaultDBFillServiceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class DaoModule {
   
    private val database = Room.databaseBuilder(
        App.instance.baseContext,
        FitnesBagDatabase::class.java,
        "FitnesBagDatabase"
    ).allowMainThreadQueries().build()
    
    @Provides
    @Singleton
    fun provideTrainProgramDao() : TrainProgramDao {
        return database.getTrainProgramDao()
    }

    @Provides
    @Singleton
    fun provideTrainInTrainsProgramDao() : TrainInTrainsProgramDao {
        return database.getTrainInTrainsProgramDao()
    }

    @Provides
    @Singleton
    fun provideTrainExerciseDao() : TrainExerciseDao {
        return database.getTrainExerciseDao()
    }

    @Provides
    @Singleton
    fun provideTrainDao() : TrainDao {
        return database.getTrainDao()
    }

    @Provides
    @Singleton
    fun provideTimerTrainExerciseDao() : TimerTrainExerciseDao {
        return database.getTimerTrainExerciseDao()
    }

    @Provides
    @Singleton
    fun provideExerciseDao() : ExerciseDao {
        return database.getExerciseDao()
    }

    @Provides
    @Singleton
    fun provideCounterTrainExerciseDao() : CounterTrainExerciseDao {
        return database.getCounterTrainExerciseDao()
    }

    @Provides
    @Singleton
    fun provideDefaultDBFillService(
            counterTrainExerciseDao: CounterTrainExerciseDao,
            exerciseDao: CounterTrainExerciseDao,
            timerTrainExerciseDao: TimerTrainExerciseDao,
            trainDao: TrainDao,
            trainExerciseDao: TrainExerciseDao,
            trainInTrainsProgramDao: TrainInTrainsProgramDao,
            trainProgramDao: TrainProgramDao
        ) : DefaultDBFillService {
        return DefaultDBFillServiceImpl( 
            counterTrainExerciseDao,
            exerciseDao,
            timerTrainExerciseDao,
            trainDao,
            trainExerciseDao,
            trainInTrainsProgramDao,
            trainProgramDao)
    }
}
