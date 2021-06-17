package com.example.fitnesbag.data.model.impl

import com.example.fitnesbag.data.model.TrainInTrainsProgram
import com.example.fitnesbag.data.model.TrainsProgram

data class TrainsProgramImpl(
        override val id: Int,
        override var name: String,
        override var description: String,
        override var imagePath: String,
        override var list: List<TrainInTrainsProgram>
) : TrainsProgram