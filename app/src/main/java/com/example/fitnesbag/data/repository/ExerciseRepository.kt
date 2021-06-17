package com.example.fitnesbag.data.repository

import com.example.fitnesbag.data.model.Exercise

interface ExerciseRepository {
    fun getExercise(id: Int) : Exercise
    fun getExercises() : List<Exercise>
    fun insert(exercise: Exercise)
    fun update(id: Int, exercise: Exercise)
    fun delete(id: Int)
}