package com.example.fitnesbag.data.model.impl

import com.example.fitnesbag.data.model.Exercise

data class ExerciseImpl(
        override val id: Int,
        override var name: String,
        override var imagePath: String,
        override var description: String,
        override var defaultRestSeconds: Int
) : Exercise