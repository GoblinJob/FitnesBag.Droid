package com.example.fitnesbag.data.model.impl

import com.example.fitnesbag.data.model.Exercise
import com.example.fitnesbag.data.model.Train

class TrainImpl (
        override val id: Int,
        override var name: String,
        override var description: String,
        override var imagePath: String,
        override var defaultRestSeconds: Int,
        override var exercises: List<Exercise>
) : Train