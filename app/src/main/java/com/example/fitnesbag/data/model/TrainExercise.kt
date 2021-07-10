package com.example.fitnesbag.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(
        ForeignKey(
                entity = Train::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("trainId")
        ),
        ForeignKey(
                entity = Exercise::class,
                parentColumns = arrayOf("id"),
                childColumns = arrayOf("exerciseId")
        )
))
data class TrainExercise(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        val trainId: Int,
        var exerciseId: Int,
        var restSeconds: Int
)
