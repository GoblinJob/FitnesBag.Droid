package com.example.fitnesbag.data.model.impl

import com.example.fitnesbag.data.model.Exercise
import com.example.fitnesbag.data.model.TrainExercise

data class TrainExerciseImpl(
        override val exercise: Exercise,
        override var restSeconds: Int
) : TrainExercise