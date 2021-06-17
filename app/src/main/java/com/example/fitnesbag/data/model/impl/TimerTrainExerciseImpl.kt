package com.example.fitnesbag.data.model.impl

import com.example.fitnesbag.data.model.Exercise
import com.example.fitnesbag.data.model.TimerTrainExercise

data class TimerTrainExerciseImpl(
        override var secondsToDone: Int,
        override val exercise: Exercise,
        override var restSeconds: Int
) : TimerTrainExercise