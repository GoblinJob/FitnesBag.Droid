package com.example.fitnesbag.data.dao

import androidx.room.*
import com.example.fitnesbag.data.model.*


@Dao
interface TimerTrainExerciseDao {
    @Query("SELECT * FROM timerTrainExercise WHERE trainExerciseId = :trainExerciseId")
    fun getByTrainExercise(trainExerciseId: Long): List<TimerTrainExercise>?
    
    @Insert
    fun insert(timerTrainExercise: TimerTrainExercise)

    @Update
    fun update(timerTrainExercise: TimerTrainExercise)

    @Delete
    fun delete(timerTrainExercise: TimerTrainExercise)
}

