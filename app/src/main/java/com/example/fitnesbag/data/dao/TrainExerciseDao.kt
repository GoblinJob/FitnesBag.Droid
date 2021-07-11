package com.example.fitnesbag.data.dao

import androidx.room.*
import com.example.fitnesbag.data.model.Train
import com.example.fitnesbag.data.model.TrainExercise
import com.example.fitnesbag.data.model.TrainInTrainsProgram
import com.example.fitnesbag.data.model.TrainsProgram


@Dao
interface TrainExerciseDao {
    @Query("SELECT * FROM trainExercise WHERE trainId = :trainId")
    fun getByTrain(trainId: Long): List<TrainExercise>?

    @Query("SELECT * FROM trainExercise WHERE trainId = :trainId AND exerciseNumber = :exerciseNumber")
    fun getByTrain(trainId: Long, exerciseNumber: Int): TrainExercise?

    @Insert
    fun insert(trainExercise: TrainExercise)

    @Update
    fun update(trainExercise: TrainExercise)

    @Delete
    fun delete(trainExercise: TrainExercise)
}

