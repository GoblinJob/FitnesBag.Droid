package com.example.fitnesbag.data.dao

import androidx.room.*
import com.example.fitnesbag.data.model.TrainsProgram


@Dao
interface TrainProgramDao {
    @Query("SELECT * FROM trainsProgram")
    fun getAll(): List<TrainsProgram?>?

    @Query("SELECT * FROM trainsProgram WHERE id = :id")
    fun getById(id: Long): TrainsProgram?

    @Insert
    fun insert(trainsProgram: TrainsProgram)

    @Update
    fun update(trainsProgram: TrainsProgram)

    @Delete
    fun delete(trainsProgram: TrainsProgram)
}

