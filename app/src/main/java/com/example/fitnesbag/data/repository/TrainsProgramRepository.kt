package com.example.fitnesbag.data.repository

import com.example.fitnesbag.data.model.Exercise
import com.example.fitnesbag.data.model.Train
import com.example.fitnesbag.data.model.TrainsProgram

interface TrainsProgramRepository {
    fun getExercise(id: Int) : TrainsProgram
    fun getExercises() : List<TrainsProgram>
    fun insert(entity: TrainsProgram)
    fun update(id: Int, entity: TrainsProgram)
    fun delete(id: Int)
}