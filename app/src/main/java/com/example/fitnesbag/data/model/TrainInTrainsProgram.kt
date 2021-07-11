package com.example.fitnesbag.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.function.BinaryOperator

@Entity(foreignKeys = arrayOf(
        ForeignKey(
                entity = Train::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("trainId")
        ),
        ForeignKey(
                entity = TrainsProgram::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("trainProgramId")
        )
))
data class TrainInTrainsProgram(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val trainId: Int,
        var trainProgramId: Int,
        var trainNumber: Int,
        var hoursToNextTrain: Int
)
