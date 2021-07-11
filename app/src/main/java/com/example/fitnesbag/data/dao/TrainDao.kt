package com.example.fitnesbag.data.dao

import androidx.room.*
import com.example.fitnesbag.data.model.Train
import com.example.fitnesbag.data.model.TrainInTrainsProgram
import com.example.fitnesbag.data.model.TrainsProgram


@Dao
interface TrainDao {
    @Query("SELECT * FROM train")
    fun getAll(): List<Train?>?

    @Query("SELECT * FROM train WHERE id = :id")
    fun getById(id: Long): Train?

    @Insert
    fun insert(train: Train)

    @Update
    fun update(train: Train)

    @Delete
    fun delete(train: Train)
}

