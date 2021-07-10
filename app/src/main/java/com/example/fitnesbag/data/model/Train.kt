package com.example.fitnesbag.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Train(
        @PrimaryKey(autoGenerate = true)
        val id: Int,
        var name: String,
        var description: String,
        var imagePath: String
)
