package com.example.fitnesbag.data.model

interface Exercise {
    val id: Int
    var name: String
    var imagePath: String
    var description: String
    var defaultRestSeconds: Int
}