package com.example.fitnesbag.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(
        ForeignKey(
                entity = TrainExercise::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("trainExerciseId"),
                onUpdate = ForeignKey.CASCADE,
                onDelete = ForeignKey.CASCADE)
        )
)
data class TimerTrainExercise(
        @PrimaryKey()
        val trainExerciseId: Int,
        var secondsToDone: Int
)