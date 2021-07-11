package com.example.fitnesbag.data.dao

import androidx.room.*
import com.example.fitnesbag.data.model.Exercise
import com.example.fitnesbag.data.model.Train
import com.example.fitnesbag.data.model.TrainInTrainsProgram
import com.example.fitnesbag.data.model.TrainsProgram


@Dao
interface ExerciseDao {
    @Query("SELECT * FROM exercise")
    fun getAll(): List<Exercise?>?

    @Query("SELECT * FROM exercise WHERE id = :id")
    fun getById(id: Long): Exercise?

    @Insert
    fun insert(exercise: Exercise)

    @Update
    fun update(exercise: Exercise)

    @Delete
    fun delete(exercise: Exercise)
}

