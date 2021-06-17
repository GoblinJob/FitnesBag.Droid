package com.example.fitnesbag.data.model.impl

import com.example.fitnesbag.data.model.Train
import com.example.fitnesbag.data.model.TrainInTrainsProgram

data class TrainInTrainsProgramImpl(
        override val train: Train,
        override var hoursToNextComplex: Int
) : TrainInTrainsProgram