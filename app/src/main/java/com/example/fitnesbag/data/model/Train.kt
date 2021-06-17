package com.example.fitnesbag.data.model

interface Train {
    val id: Int
    var name: String
    var description: String
    var imagePath: String
    var defaultRestSeconds: Int
    var exercises: List<Exercise>
}