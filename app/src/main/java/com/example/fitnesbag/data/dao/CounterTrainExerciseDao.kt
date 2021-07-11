package com.example.fitnesbag.data.dao

import androidx.room.*
import com.example.fitnesbag.data.model.*


@Dao
interface CounterTrainExerciseDao {
    @Query("SELECT * FROM counterTrainExercise WHERE trainExerciseId = :trainExerciseId")
    fun getByTrainExercise(trainExerciseId: Long): List<CounterTrainExercise>?
    
    @Insert
    fun insert(counterTrainExercise: CounterTrainExercise)

    @Update
    fun update(counterTrainExercise: CounterTrainExercise)

    @Delete
    fun delete(counterTrainExercise: CounterTrainExercise)
}

