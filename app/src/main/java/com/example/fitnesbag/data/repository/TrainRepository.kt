package com.example.fitnesbag.data.repository

import com.example.fitnesbag.data.model.Exercise
import com.example.fitnesbag.data.model.Train

interface TrainRepository {
    fun getExercise(id: Int) : Train
    fun getExercises() : List<Train>
    fun insert(entity: Train)
    fun update(id: Int, entity: Train)
    fun delete(id: Int)
}