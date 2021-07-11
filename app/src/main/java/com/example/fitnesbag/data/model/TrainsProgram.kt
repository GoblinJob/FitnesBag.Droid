package com.example.fitnesbag.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TrainsProgram(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        var name: String,
        var description: String,
        var imagePath: String,
        var isDone: Boolean,
        var isDoing: Boolean,
        var trainsDoneCount: Int
)
