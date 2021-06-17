package com.example.fitnesbag.data.model.impl

import com.example.fitnesbag.data.model.CounterTrainExercise
import com.example.fitnesbag.data.model.Exercise

data class CounterTrainExerciseImpl(
        override var count: Int,
        override val exercise: Exercise,
        override var restSeconds: Int
) : CounterTrainExercise