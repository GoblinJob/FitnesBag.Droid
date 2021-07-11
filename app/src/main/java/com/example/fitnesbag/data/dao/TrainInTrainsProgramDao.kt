package com.example.fitnesbag.data.dao

import androidx.room.*
import com.example.fitnesbag.data.model.TrainInTrainsProgram
import com.example.fitnesbag.data.model.TrainsProgram


@Dao
interface TrainInTrainsProgramDao {
    @Query("SELECT * FROM trainInTrainsProgram WHERE trainProgramId = :trainProgramId")
    fun getByTrainProgram(trainProgramId: Long): List<TrainInTrainsProgram>?

    @Query("SELECT * FROM trainInTrainsProgram WHERE trainProgramId = :id AND trainNumber = :trainNumber")
    fun getByTrainProgram(id: Long, trainNumber: Int): TrainInTrainsProgram?

    @Insert
    fun insert(trainInTrainsProgram: TrainInTrainsProgram)

    @Update
    fun update(trainInTrainsProgram: TrainInTrainsProgram)

    @Delete
    fun delete(trainInTrainsProgram: TrainInTrainsProgram)
}

