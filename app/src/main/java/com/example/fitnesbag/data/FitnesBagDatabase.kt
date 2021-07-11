package com.example.fitnesbag.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fitnesbag.data.dao.*
import com.example.fitnesbag.data.model.*

@Database(entities = arrayOf(
        CounterTrainExercise::class,
        Exercise::class,
        TimerTrainExercise::class,
        Train::class,
        TrainExercise::class,
        TrainInTrainsProgram::class,
        TrainsProgram::class
), version = 1)
abstract class FitnesBagDatabase : RoomDatabase() {
    abstract fun getTrainProgramDao(): TrainProgramDao
    abstract fun getTrainInTrainsProgramDao(): TrainInTrainsProgramDao
    abstract fun getTrainExerciseDao(): TrainExerciseDao
    abstract fun getTrainDao(): TrainDao
    abstract fun getTimerTrainExerciseDao(): TimerTrainExerciseDao
    abstract fun getExerciseDao(): ExerciseDao
    abstract fun getCounterTrainExerciseDao(): CounterTrainExerciseDao
}
